package com.tutorial.main;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Window extends Canvas{
	
	private static final long serialVersionUID = -1631627260657711748L;
	
	public Window(int width, int height, String title, Game game) {
		
	JFrame frame = new JFrame("Flappy Bird");
	frame.setSize(width, height);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.add(game);
	game.start();
	}

}
