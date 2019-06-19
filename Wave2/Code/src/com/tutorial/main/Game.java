package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 1550691097823471818L;
	
	public static final float WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	public static boolean paused = false;
	public static int diff = 0;
	
	//0 = easy, 1 = normal, 2 = impossible
	
	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	private Menu menu;
	private Shop2 shop2;
	
	public enum STATE{
		Menu,
		Menu2,
		Help,
		Help2, 
		End,
		Select,
		Select2,
		Shop2,
		Final0,
		Final1,
		Final2,
		Game
	};
	
	public static STATE gameState = STATE.Menu;
	
	public Game() {
		
		handler = new Handler();
		hud = new HUD();
		shop2 = new Shop2(handler, hud);
		menu = new Menu(handler, r, hud);
		this.addKeyListener(new KeyInput(handler, this));
		this.addMouseListener(menu);
		this.addMouseListener(shop2);
		
		AudioPlayer.load();
		
		AudioPlayer.getMusic("music").loop();
		
		new Window(WIDTH, HEIGHT, "Wave2", this);
		
		spawner = new Spawn(handler, hud);
		r = new Random();
		
		if(gameState == STATE.Game)
		{
			handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
			handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
		}else{
			for(int i = 0; i < 20; i++) {
				handler.addObject(new MenuParticle(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.MenuParticle, handler));
			}
		}
		
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		float frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			if(running)
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void tick() {
		
		if(gameState == STATE.Game)
		{
			if(!paused) 
			{
				handler.tick();
				hud.tick();
				spawner.tick();
				
				if(HUD.HEALTH <= 0) {
					HUD.HEALTH = (100 + hud.bounds);
					gameState = STATE.End;
					handler.clearEnemies();
					for(int i = 0; i < 20; i++) {
						handler.addObject(new MenuParticle(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.MenuParticle, handler));
					}

				}
			

			}
			
		}
		else if(gameState == STATE.Final0 || gameState == STATE.Final1 || gameState == STATE.Final2) {
			handler.clearEnemies();
			for(int i = 0; i < 20; i++) {
				handler.addObject(new MenuParticle(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.MenuParticle, handler));
			}
		}
						
		else if(gameState != STATE.Game && gameState != STATE.Shop2) {
			handler.tick();
			menu.tick();
		}
		
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, (int)WIDTH, (int)HEIGHT);
		
		if(paused) {
			handler.render(g);
			g.drawString("Paused", 100, 100);
		}
		
		if(gameState == STATE.Game){
			hud.render(g);	
			handler.render(g);
		}else if(gameState == STATE.Shop2) {
			shop2.render(g);
		}else if(gameState != STATE.Game && gameState != STATE.Shop2) {
			menu.render(g);
			handler.render(g);
		}
		
		g.dispose();
		bs.show();
	}
	
	public static float clamp(float var, float min, float max) {
		if(var >= max) 
			return var = max;
		else if(var <= min)
			return var = min;
		else
			return var;
	}
	
	public static void main(String args[]) {
		new Game();
	}
}
