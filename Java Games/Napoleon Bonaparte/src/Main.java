package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Main extends Canvas implements Runnable{

	private static final long serialVersionUID = 6408703147255293408L;
	
	private Thread thread;
	private boolean running = false;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 700;
	
	public int power = 0;
	public int fame = 0;
	
	private mRender mr;
	private mRender2 mr2;
	BufferedImage face = null;
	BufferedImage map = null;
	BufferedImage fr = null;
	BufferedImage it = null;
	BufferedImage c18 = null;
	BufferedImage ba = null;
	BufferedImage ru = null;
	BufferedImage pw = null;
	BufferedImage h00 = null;
	
	public enum STATE{
		Start, //Opening Slide
		Born, //Napoleon's Early Years
		BornY,
		BornN,
		Rev, //Napoleon during the Revolution
		RevY,
		RevN,
		It, //Napoleon's Italian Campaign
		ItY,
		ItN,
		eight, //The Coup of 18 Brumaire
		eN,
		eY,
		ba, //The Battle of Austerlitz and British Sanctions
		baN,
		baY,
		ru, //Napoleon's Russian Invasion
		ruY,
		ruN,
		loss, //The Peninsular War and The Loss of Paris
		lossY,
		lossN,
		o00, //The Hundred Days
		end //The end of the game
	};
	
	public static STATE gameState = STATE.Start;
	
	public Main() {
		
		
		new Window(WIDTH, HEIGHT, "The Napoleon Game", this);
		mr = new mRender();
		mr2 = new mRender2();
		
		BufferedImageLoader loader = new BufferedImageLoader();
		face = loader.loadImage("Napoleon Face.jpg");
		fr = loader.loadImage("France Revolution.jpg");
		map = loader.loadImage("Corsica Map.jpg");
		it = loader.loadImage("Italian Campaign2.jpg");
		c18 = loader.loadImage("Coup of 18 Brumaire.jpeg");
		ba = loader.loadImage("Battle of Austerlitz.gif");
		ru = loader.loadImage("Russian Winter.jpeg");
		pw = loader.loadImage("Peninsular War.jpg");
		h00 = loader.loadImage("H00 Days.jpg");
		
		this.addKeyListener(new KeyInput(this));
		this.requestFocus();
		
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
	
	public void tick() {
		
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		if(gameState == STATE.Start) {
			mr.render(g);
			g.drawImage(face, 500, 0, null);
		}
		
		if(gameState == STATE.Born) {
			mr2.render(g);
			g.drawImage(map, 680, 90, 730, 631, null);
		}
		
		if(gameState == STATE.end || gameState == STATE.lossN || gameState == STATE.lossY || gameState == STATE.ruN || gameState == STATE.ruY || gameState == STATE.baN || gameState == STATE.baY || gameState == STATE.eN || gameState == STATE.eY || gameState == STATE.BornY || gameState == STATE.BornN || gameState == STATE.RevY || gameState == STATE.RevN || gameState == STATE.ItY ||gameState == STATE.ItN) {
			mr2.render(g);
		}
		
		if(gameState == STATE.Rev) {
			mr2.render(g);
			g.drawImage(fr, 650, 90, 730, 631, null);
			
		}
		
		if(gameState == STATE.It) {
			mr2.render(g);
			g.drawImage(it, 650, 90, 730, 631, null);
		}
		
		if(gameState == STATE.eight) {
			mr2.render(g);
			g.drawImage(c18, 650, 90, 730, 631, null);
		}
		
		if(gameState == STATE.ba) {
			mr2.render(g);
			g.drawImage(ba, 650, 90, 730, 631, null);
		}
		
		if(gameState == STATE.ru) {
			mr2.render(g);
			g.drawImage(ru, 650, 90, 730, 631, null);
		}
		
		if(gameState == STATE.loss) {
			mr2.render(g);
			g.drawImage(pw, 650, 90, 730, 631, null);
		}
		
		if(gameState == STATE.o00) {
			mr2.render(g);
			g.drawImage(h00, 650, 90, 730, 631, null);
		}
		
		if(gameState != STATE.Start || gameState != STATE.end) {
			Font fnt4 = new Font("arial", 20, 30);
			g.setFont(fnt4);
			
			g.fillRect(1160, 6, 180, 76);
			g.setColor(Color.black);
			g.fillRect(1163, 9, 174, 70);
			g.setColor(Color.white);
			g.drawString("Power: " + power, 1175, 35);
			g.drawString("Fame:  " + fame, 1175, 75);
		}
		
		
		g.dispose();
		bs.show();
	}

	public static void main(String[] args) {
		new Main();
	}

}
