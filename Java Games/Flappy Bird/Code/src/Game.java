package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Random;

public class Game extends Canvas implements Runnable, KeyListener{
	
	private static final long serialVersionUID = 799353468631028987L;
	
	public ArrayList<Rectangle> columns;

	public static final int WIDTH = 1000, HEIGHT = 700;
	
	private Thread thread;
	
	private boolean running = false, gameOver = false, started = false;
	
	public Rectangle bird;
	
	public Random rand;
	
	public int ticks, yMotion, score, hscore;
	
	public Game() {
		
		new Window(WIDTH, HEIGHT, "Flappy Bird", this);
		
		columns = new ArrayList<Rectangle>();
		
		this.addKeyListener(this);
		
		bird = new Rectangle(WIDTH / 2 - 200, HEIGHT / 2 - 10, 20, 20);
		
		rand = new Random();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
		
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
		
		if(hscore <= score) {
			hscore = score;
		}
		
		if(started) {
		int speed = 10;
		
		ticks++;
		
		for(int i = 0; i < columns.size(); i++) {
			
			Rectangle column = columns.get(i);
			column.x -= speed;
			
		}
		
		if(ticks % 2 == 0 && yMotion < 15) {
			yMotion += 2;
		}
		
		for(int i = 0; i < columns.size(); i++) {
			
			Rectangle column = columns.get(i);
			
			if(column.x + column.width < 0) {
				
				columns.remove(column);
				
				if(column.y == 0) {
					
				addColumn(false);
				
				}
			}
			
		}
		
		if(gameOver == false) {
		bird.y += yMotion;
		}
		
		for(Rectangle column : columns) {
			
			if(column.y == 0 && bird.x + bird.width / 2 > column.x + column.width / 2 - 10  && bird.x + bird.width / 2 < column.x + column.width / 2 + 10) {
				score += 1;
			}
			
			if(column.intersects(bird)) {
				gameOver = true;
				bird.x = column.x - bird.width;
				bird.y = HEIGHT - 100 - bird.height;
			}
		}
		
		if(bird.y >= HEIGHT - 120 || bird.y < 0) {
			gameOver = true;
		}
		
		if(bird.y + yMotion > HEIGHT - 120) {
			bird.y += 0;

			bird.y = HEIGHT - 100 - bird.height;
		}
		}
	}
	
	public void jump() {
		
		if(gameOver) {
			
			bird = new Rectangle(WIDTH / 2 - 200, HEIGHT / 2 - 10, 20, 20);
			columns.clear();
			yMotion = 0;
			score = 0;
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			
			gameOver = false;
		}
		
		if(!started) {
			started = true;
		} 
		else if (!gameOver) {
			
			if(yMotion > 0) {
				
				yMotion = 0;
				
			}
		
		yMotion -= 10;
		
		}
	}
	
	public void addColumn(boolean start) {
		int space = 250;
		int width = 100;
		int height = 50 + rand.nextInt(200);
		
		if(start){
			
		columns.add(new Rectangle(WIDTH + width + columns.size() * 500, HEIGHT - height - 100, width, height));
		columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 500, 0, width, HEIGHT - height - space));
		
		}else {
			
			columns.add(new Rectangle(columns.get(columns.size() - 1).x + 900, HEIGHT - height - 100, width, height));
			columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
			
		}
	}
	
	public void renderColumn(Graphics g, Rectangle column) {
		
		Color dgreen = new Color(0, 100, 0);
		g.setColor(dgreen);
		g.fillRect(column.x, column.y, column.width, column.height);
		
	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		Color lblue = new Color(0, 180, 255);
		g.setColor(lblue);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.orange.darker());
		g.fillRect(0, HEIGHT - 85, WIDTH, 85);
		
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT - 100, WIDTH, 15);
		
		for(Rectangle column : columns) {
			renderColumn(g, column);
		}
		
		g.setFont(new Font("Arial", 1, 80));
		g.setColor(Color.WHITE);
		
		if(!started) {
			g.drawString("Click Space to Play!", 110, HEIGHT / 2);
		}
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", 1, 80));
		
		if(gameOver) {
			g.drawString("Game Over!", WIDTH / 2 - 225, HEIGHT / 2 - 50);
			
			g.setFont(new Font("Arial", 1, 50));
			g.drawString("Click Space to Play!", WIDTH / 2 - 235, HEIGHT / 2 + 50);
		}
		
		if(!gameOver && started) {
			g.drawString(String.valueOf(score), WIDTH / 2 - 25, 100);
		}
		
		g.setFont(new Font("Arial", 1, 30));
		
		g.drawString("High Score: " + (String.valueOf(hscore)), 50, 50);
	
		
		g.setColor(Color.yellow);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
		g.dispose();
		bs.show();
	}

	public void keyPressed(KeyEvent e) {
		
	}

	@SuppressWarnings("static-access")
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == e.VK_SPACE) {
			jump();
		}
	}

	public void keyTyped(KeyEvent e) {
		
	}
	
	public static void main(String args[]) {
		new Game();
	}
}
