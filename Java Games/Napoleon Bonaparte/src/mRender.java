package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import com.tutorial.main.Main.STATE;

public class mRender {
	
	public Main main;
	
	public void render(Graphics g) {
		if(Main.gameState == STATE.Start) {
		Font fnt = new Font("arial", 10, 40);
		g.setFont(fnt);
		
		g.setColor(Color.black);
		g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
		
		g.setColor(Color.WHITE);
		g.fillRect(-10, 50, 475, 2);
		g.fillRect(-10, 640, 475, 2);
		
		g.drawString("The Napoleon Game", 10, 40);
		g.drawString("Press Space to Play!", 10, 680);
		
		Font fnt1 = new Font("arial", 10, 20);
		g.setFont(fnt1);
		g.drawString("The goal of the game is to make the most", 30, 100);
		g.drawString("strategic decisisons to earn more power", 30, 150);
		g.drawString("and fame. Power and fame points are how", 30, 200);
		g.drawString("you are scored. The more, the better.", 30, 250);
		g.drawString("Try to beat Napoleon's total score of 100!", 30, 300);
		}
	}

}
