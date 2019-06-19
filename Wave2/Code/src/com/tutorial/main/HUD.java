package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	
	
	public int bounds = 0;
	public static float HEALTH = 100;
	private float greenValue = 255;

	private float level = 1;
	private float time = 1218;
	private float score = 0;
	
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100+(bounds/2));
		level = Game.clamp(level, 1, 15);
		time = Game.clamp(time, 0, 1218);
		
		greenValue = HEALTH * 2;
		greenValue = Game.clamp(greenValue, 0, 255);
		
			time--;
			if(time == 0) {
				time = 1218;
			}
			score++;
			
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(20, 10, 200 + bounds, 32);
		g.setColor(new Color(55, (int)greenValue, 0));
		g.fillRect(20, 10, (int) (HEALTH * 2), 32);
		g.setColor(Color.white);
		g.drawRect(20, 10, 200 + bounds, 32);
		
		g.drawString("Wave: " + ((int)level), 108, 60);
		g.drawString("Score: " + ((int)score/10), 163, 60);
		g.drawString("Time Left: " + (time/10), 10, 60);
		g.drawString("Space for Shop", 10, 74);
	}
	
	public float getLevel() {
		return level;
	}
	
	public void setLevel(float level) {
		this.level = level;
	}

	public void setTime(float time) {
		this.time = time;
	}
	
	public float getTime() {
		return time;
	}

	public float getScore() {
		return score;
	}
	
	public void setScore(float score) {
		this.score = score;
	}
}
