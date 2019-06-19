package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shop2 extends MouseAdapter{
	
	Handler handler;
	HUD hud;
	
	private int B1 = 30000;
	private int B2 = 30000;
	private int B3 = 30000;
		
	public Shop2(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", 0, 48));
		g.drawString("SHOP", 240, 50);
		
		g.setFont(new Font("arial", 0, 36));
		g.drawString("Score Avaliable: " + (int)(hud.getScore()/10), 10, 400);
		
		//box 1
		g.setFont(new Font("arial", 0, 12));
		g.drawString("Upgrade Health", 108, 120);
		g.drawString("Cost: " + (B1 / 10), 120, 140);
		g.drawRect(100, 100, 100, 80);
		
		//box 2
		g.drawString("Upgrade Speed", 258, 120);
		g.drawString("Cost: " + (B2 / 10), 270, 140);
		g.drawRect(250, 100, 100, 80);
				
		//box 3
		g.drawString("Refill Health", 408, 120);
		g.drawString("Cost: " + (B3 / 10), 420, 140);
		g.drawRect(400, 100, 100, 80);
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		//box 1
		if(mx >= 100 && mx <= 200) {
			if(my >= 100 && my <= 180) {
				//you've selected box1
				System.out.println("box 1");
				if(hud.getScore() >= B1) {
					hud.setScore(hud.getScore() - B1);
					B1 += 15000;
					hud.bounds += 10;
					HUD.HEALTH = (HUD.HEALTH + (hud.bounds / 2));
				}
			}
		}
		
		//box 2
		if(mx >= 250 && mx <= 350) {
			if(my >= 100 && my <= 180) {
				//you've selected box2
				System.out.println("box 2");
				if(hud.getScore() >= B2) {
					hud.setScore(hud.getScore() - B2);
					B2 += 15000;
					handler.spd++;
					
				}
			}
		}
				
		//box 3
		if(mx >= 400 && mx <= 500) {
			if(my >= 100 && my <= 180) {
				System.out.println("box 3");
				if(hud.getScore() >= B3) {
					hud.setScore(hud.getScore() - B3);
					HUD.HEALTH = (100 + (hud.bounds / 2));
				}
			}
		}
		
	}
}
