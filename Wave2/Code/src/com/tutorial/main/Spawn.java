package com.tutorial.main;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public static float timeKeep = 1218;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		timeKeep--;
		if(timeKeep <= 0) {
			timeKeep = 1218;
			hud.setScore(hud.getScore()+10000);
			hud.setLevel(hud.getLevel() + 1);
				if(Game.diff == 0) {
					if(hud.getLevel() == 3) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 4) {
						handler.addObject(new SmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
					}else if(hud.getLevel() == 5) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 6) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 7) {
						handler.clearEnemies();
						HUD.HEALTH = (100 + hud.bounds);
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if (hud.getLevel() == 8) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 9) {
						handler.addObject(new SmartEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));	
					}else if(hud.getLevel() == 10) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 11) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if (hud.getLevel() == 13) {
						handler.addObject(new EasyEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 15) {
						Game.gameState = Game.STATE.Final0;
					}
				}else if(Game.diff == 1) {
					if(hud.getLevel() == 2) {
						handler.addObject(new SmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
					}else if(hud.getLevel() == 3) {
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 4) {
						handler.addObject(new FastEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.FastEnemy, handler));
					}else if(hud.getLevel() == 5) {
						handler.clearEnemies();
						handler.addObject(new BigEnemy((Game.WIDTH / 2) - 48, - 110, ID.BigEnemy, handler));
					}else if(hud.getLevel() == 6) {
						handler.clearEnemies();
						handler.addObject(new SmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 7) {
						handler.addObject(new FastEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.FastEnemy, handler));
					}else if (hud.getLevel() == 8) {
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 9) {
						handler.addObject(new SmartEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));	
					}else if(hud.getLevel() == 10) {
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 11) {
						handler.addObject(new SmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
					}else if (hud.getLevel() == 13) {
						handler.addObject(new BasicEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 15) {
						Game.gameState = Game.STATE.Final1;
					}
				}else if(Game.diff == 2) {
					if(hud.getLevel() == 2) {
						handler.addObject(new HardSmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 3) {
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new HardSmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
					}else if(hud.getLevel() == 4) {
						handler.addObject(new FastEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.FastEnemy, handler));
					}else if(hud.getLevel() == 5) {
						handler.clearEnemies();
						handler.addObject(new BigEnemy((Game.WIDTH / 2) - 48, - 110, ID.BigEnemy, handler));
					}else if(hud.getLevel() == 6) {
						handler.clearEnemies();
						handler.addObject(new HardSmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 7) {
						handler.addObject(new FastEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.FastEnemy, handler));
					}else if (hud.getLevel() == 8) {
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 9) {
						handler.addObject(new HardSmartEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));	
					}else if(hud.getLevel() == 10) {
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 11) {
						handler.addObject(new HardSmartEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
					}else if (hud.getLevel() == 13) {
						handler.addObject(new HardEnemy(r.nextInt((int)Game.WIDTH - 50), r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
					}else if(hud.getLevel() == 15) {
						Game.gameState = Game.STATE.Final2;
					}
				}
					
		}
		
		}
	}