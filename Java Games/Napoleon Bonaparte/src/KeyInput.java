package com.tutorial.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.tutorial.main.Main.STATE;

public class KeyInput extends KeyAdapter{
	
	private boolean[] keyDown = new boolean[2];
	
	Main main;
	
	public KeyInput(Main main) {
		
		this.main = main;
		
		keyDown[0] = false;
		keyDown[1] = false;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(Main.gameState == STATE.Start) {
			if(key == KeyEvent.VK_SPACE) 
			{
				Main.gameState = STATE.Born;
			}
			}
		
	///////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.Born) {
				if(key == KeyEvent.VK_Y) {
					Main.gameState = STATE.BornY;
					main.fame += 10;
					keyDown[0] = true; 
				}
				
				if(key == KeyEvent.VK_N) {
					Main.gameState = STATE.BornN;
					main.fame -= 10;
					keyDown[1] = true; 
				}
		}
		
		if(Main.gameState == STATE.BornY || Main.gameState == STATE.BornN) {
			if(key == KeyEvent.VK_SPACE) {
				Main.gameState = STATE.Rev;
			}
		}
	/////////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.Rev) {
			if(key == KeyEvent.VK_Y) {
				Main.gameState = STATE.RevY;
				main.fame += 5;
				main.power += 10;
				keyDown[0] = true; 
			}
			
			if(key == KeyEvent.VK_N) {
				Main.gameState = STATE.RevN;
				main.fame -= 5;
				main.power -= 5;
				keyDown[1] = true; 
			}
	}
		
		if(Main.gameState == STATE.RevY || Main.gameState == STATE.RevN) {
			if(key == KeyEvent.VK_SPACE) {
				Main.gameState = STATE.It;
			}
		}
	//////////////////////////////////////////////////////////////////////////	
		if(Main.gameState == STATE.It) {
			if(key == KeyEvent.VK_Y) {
				Main.gameState = STATE.ItY;
				main.fame += 5;
				main.power += 5;
				keyDown[0] = true; 
			}
			
			if(key == KeyEvent.VK_N) {
				Main.gameState = STATE.ItN;
				main.fame -= 5;
				keyDown[1] = true; 
			}
	}
		
		if(Main.gameState == STATE.ItY || Main.gameState == STATE.ItN) {
			if(key == KeyEvent.VK_SPACE) {
				Main.gameState = STATE.eight;
			}
		}
	//////////////////////////////////////////////////////////////////////////
		
		if(Main.gameState == STATE.eight) {
			if(key == KeyEvent.VK_ENTER) {
				if(main.power <= 0 || main.fame <= 0) {
					Main.gameState = STATE.eN;
				}else {
					Main.gameState = STATE.eY;
				}
			}
	}
		if(Main.gameState == STATE.eN || Main.gameState == STATE.eY) {
			if(key == KeyEvent.VK_SPACE) {
			Main.gameState = STATE.ba;
			}
		}
	/////////////////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.ba) {
			if(key == KeyEvent.VK_Y) {
				Main.gameState = STATE.baY;
				main.power -= 5;
				main.fame -= 5;
				keyDown[0] = true; 
			}
			
			if(key == KeyEvent.VK_N) {
				Main.gameState = STATE.baN;
				keyDown[1] = true; 
			}
	}
		
		if(Main.gameState == STATE.baN || Main.gameState == STATE.baY) {
			if(key == KeyEvent.VK_SPACE) {
			Main.gameState = STATE.ru;
			}
		}
	//////////////////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.ru) {
			if(key == KeyEvent.VK_Y) {
				Main.gameState = STATE.ruY;
				main.power -= 5;
				main.fame -= 5;
				keyDown[0] = true; 
			}
			
			if(key == KeyEvent.VK_N) {
				Main.gameState = STATE.ruN;
				keyDown[1] = true; 
			}
	}
		
		if(Main.gameState == STATE.ruY || Main.gameState == STATE.ruN) {
			if(key == KeyEvent.VK_SPACE) {
				Main.gameState = STATE.loss;
			}
		}
	////////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.loss) {
			if(key == KeyEvent.VK_Y) {
				Main.gameState = STATE.lossY;
				main.fame += 10;
				main.power += 15;
				keyDown[0] = true; 
			}
			
			if(key == KeyEvent.VK_N) {
				Main.gameState = STATE.lossN;
				main.fame -= 10;
				main.power -= 10;
				keyDown[1] = true; 
			}
	}
		if(Main.gameState == STATE.lossN || Main.gameState == STATE.lossY) {
			if(key == KeyEvent.VK_SPACE) {
			Main.gameState = STATE.o00;
			}
		}
	/////////////////////////////////////////////////////////////////////////////
		if(Main.gameState == STATE.o00) {
			if(key == KeyEvent.VK_ENTER) {
				Main.gameState = STATE.end;
			}
		}
	////////////////////////////////////////////////////////////////////////
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_Y) keyDown[0] = false;
				if(key == KeyEvent.VK_N) keyDown[1] = false;
			}
		
	}
