package com.tutorial.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.tutorial.main.Game.STATE;

public class Menu extends MouseAdapter{
	
	private Handler handler;
	private Random r = new Random();
	private HUD hud;
	private Spawn spawn;
	
	public Menu(Handler handler, Random random, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(Game.gameState == STATE.Menu) {
			//Play Button
			if(mouseOver(mx, my, 210, 150, 200, 64)) {
				Game.gameState = STATE.Select;
				
				AudioPlayer.getSound("click").play();
				return;
			}
			
			//Help Button
					if(mouseOver(mx, my, 210, 250, 200, 64)) {
						Game.gameState = STATE.Help;
						AudioPlayer.getSound("click").play();
						}
		}
		
		if(Game.gameState == STATE.Menu2) {
			//2nd Play Button
			if(mouseOver(mx, my, 210, 150, 200, 64)) {
				Game.gameState = STATE.Select2;
				AudioPlayer.getSound("click").play();
				return;
			}
			//Help Button
			if(mouseOver(mx, my, 210, 250, 200, 64)) {
				Game.gameState = STATE.Help2;
				AudioPlayer.getSound("click").play();
				}
			}
		
		//Back Button (for help)
				if(Game.gameState == STATE.Help) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
					Game.gameState = STATE.Menu;
					return;
					
					}
				}
				
				if(Game.gameState == STATE.Help2) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
					Game.gameState = STATE.Menu2;
					return;
					
					}
				}
				
				//Back Button (for end)
				if(Game.gameState == STATE.End) {
					if(mouseOver(mx, my, 180, 350, 275, 64)) {
					Game.gameState = STATE.Menu2;
					return;
					}
				}
				
				if(Game.gameState == STATE.Final0) {
					if(mouseOver(mx, my, 180, 350, 275, 64)) {
					Game.gameState = STATE.Menu2;
					return;
					}
				}
				
				if(Game.gameState == STATE.Final1) {
					if(mouseOver(mx, my, 180, 350, 275, 64)) {
					Game.gameState = STATE.Menu2;
					return;
					}
				}
				
				if(Game.gameState == STATE.Final2) {
					if(mouseOver(mx, my, 180, 350, 275, 64)) {
					Game.gameState = STATE.Menu2;
					return;
					}
				}
				
				//Easy Button
				if(Game.gameState == STATE.Select) {
					if(mouseOver(mx, my, 210, 150, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 0;
					
					}
				}
				
				//Normal Button
				if(Game.gameState == STATE.Select) {
					if(mouseOver(mx, my, 210, 250, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 1;
					
					}
				}
				
				//Impossible Button
				if(Game.gameState == STATE.Select) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 2;
				
					}
				}
				//Easy Button
				if(Game.gameState == STATE.Select2) {
					if(mouseOver(mx, my, 210, 150, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 0;
					
					}
				}
				
				//Normal Button
				if(Game.gameState == STATE.Select2) {
					if(mouseOver(mx, my, 210, 250, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 1;
					
					}
				}
				
				//Impossible Button
				if(Game.gameState == STATE.Select2) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
						Game.gameState = STATE.Game;
						hud.setTime(1218);
						spawn.timeKeep = 1218;
						hud.setLevel(1);
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemies();
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int)Game.HEIGHT - 50), ID.BasicEnemy, handler));
						Game.diff = 2;
				
					}
				}
			}
				
	public void mouseReleased(MouseEvent e) {
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx > x && mx < x + width) {
			if(my > y && my < y + height) {
				return true;
			}else
				return false;
		}else
			return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		if(Game.gameState == STATE.Menu) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Wave2", 230, 70);
			
			g.setColor(Color.white);
			g.setFont(fnt2);
			g.drawRect(210, 150, 200, 64);
			g.drawString("Play", 275, 190);
			
			g.drawRect(210, 250, 200, 64);
			g.drawString("Help", 275, 290);
			
			
		}else if(Game.gameState == STATE.Help) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Help", 240, 70);
			
			g.setFont(fnt2);
			g.drawRect(210, 350, 200, 64);
			g.drawString("Back", 275, 390);
			
			g.drawString("Use arrow keys to avoid enemies", 90, 120);
			g.drawString("Use space to access shop", 90, 160);
			g.drawString("Use escape to pause", 90, 200);
			g.drawString("Use end to quit out of game", 90, 240);
			g.drawString("Try to get to Wave 15!", 90, 280);
		}
		else if(Game.gameState == STATE.End) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game Over", 180, 70);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("You have lost at wave " + ((int)hud.getLevel()), 145, 200);
		g.drawString("with a score of " + ((int)hud.getScore() / 10), 170, 250);
		
		g.drawRect(180, 350, 275, 64);
		g.drawString("Return to Menu", 200, 390);
		
	}else if(Game.gameState == STATE.Final0) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game Over", 180, 70);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Congratulations!", 190, 200);
		g.drawString("You have beaten easy mode", 110, 240);
		g.drawString("with a score of " + ((int)hud.getScore() / 10), 180, 280);
		
		g.drawRect(180, 350, 275, 64);
		g.drawString("Return to Menu", 200, 390);
		
	}else if(Game.gameState == STATE.Final1) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game Over", 180, 70);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Congratulations!", 190, 200);
		g.drawString("You have beaten normal mode", 100, 240);
		g.drawString("with a score of " + ((int)hud.getScore() / 10), 180, 280);
		
		g.drawRect(180, 350, 275, 64);
		g.drawString("Return to Menu", 200, 390);
	
	}else if(Game.gameState == STATE.Final2) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Game Over", 180, 70);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Congratulations!", 190, 200);
		g.drawString("You have beaten impossible mode", 90, 240);
		g.drawString("with a score of " + ((int)hud.getScore() / 10), 180, 280);
		
		g.drawRect(180, 350, 275, 64);
		g.drawString("Return to Menu", 200, 390);
	}else if(Game.gameState == STATE.Menu2) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Wave2", 230, 70);
		
		g.setColor(Color.white);
		g.setFont(fnt2);
		g.drawRect(210, 150, 200, 64);
		g.drawString("Play", 275, 190);
		
		g.drawRect(210, 250, 200, 64);
		g.drawString("Help", 275, 290);
		
		
	}else if(Game.gameState == STATE.Help2) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Help", 240, 70);
		
		g.setFont(fnt2);
		g.drawRect(210, 350, 200, 64);
		g.drawString("Back", 275, 390);
		
		g.drawString("Use arrow keys to avoid enemies", 90, 120);
		g.drawString("Use space to access shop", 90, 160);
		g.drawString("Use escape to pause", 90, 200);
		g.drawString("Use end to quit out of game", 90, 240);
		g.drawString("Try to get to Wave 15!", 90, 280);
	}else if(Game.gameState == STATE.Select || Game.gameState == STATE.Select2) {
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Select Difficulty", 130, 70);
		
		g.setColor(Color.white);
		g.setFont(fnt2);
		g.drawRect(210, 150, 200, 64);
		g.drawString("Easy", 275, 190);
		
		g.drawRect(210, 250, 200, 64);
		g.drawString("Normal", 260, 290);
		
		g.drawRect(210, 350, 200, 64);
		g.drawString("Impossible", 235, 390);
	}
}

}
