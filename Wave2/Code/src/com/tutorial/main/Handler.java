package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public int spd = 5;
	
	public void tick() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g){
		  try{
		   for(int i = 0; i < object.size(); i++){
		   GameObject tempObject = object.get(i);
		   
		   tempObject.render(g);
		   }
		  }catch(Exception e){
		   System.out.println("Error: "+e.toString());
		  }
	}
	
	public void clearEnemies(){
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() != ID.Player) {
				object.clear();
				if(Game.gameState != Game.STATE.End || Game.gameState != Game.STATE.Final0 || Game.gameState != Game.STATE.Final1 || Game.gameState != Game.STATE.Final2)
				addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
			if(Game.gameState == Game.STATE.End || Game.gameState == Game.STATE.Final0 || Game.gameState == Game.STATE.Final1 || Game.gameState == Game.STATE.Final2) {
				object.clear();
			}
			}
		}
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}

}