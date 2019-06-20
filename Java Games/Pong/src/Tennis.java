

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tennis extends Applet implements Runnable, KeyListener{
	
	private static final long serialVersionUID = 2173872748331077109L;

	final int WIDTH = 700, HEIGHT = 500;
	
	Thread thread;
	HumanPaddle p1;
	Ball b1;
	AIPaddle p2;
	boolean gameStarted;
	public int level = 20;
	Graphics gfx;
	Image img;
	public int score;
	
	public void init() {
		this.resize(WIDTH, HEIGHT);
		gameStarted = false;
		this.addKeyListener(this);
		p1 = new HumanPaddle(1);
		b1 = new Ball(this);
		p2 = new AIPaddle(2, b1);
		img = createImage(WIDTH, HEIGHT);
		gfx = img.getGraphics();
		thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g) {
		
		gfx.setColor(Color.black);
		gfx.fillRect(0, 0, WIDTH, HEIGHT);
		
		if(b1.getX() <= 0 || b1.getX() >= 700) {
			gfx.setColor(Color.red);
			Font fnt4 = new Font("arial", 10, 40);
			gfx.setFont(fnt4);
			gfx.drawString("Game Over", 250, 150);
			gfx.drawString("Your score was: " + score, 200, 200);
			gfx.drawString("Press Enter to Play Again!", 125, 250);
		}
		else {
			if(gameStarted) {
				Font fnt3 = new Font("arial", 10, 20);
				gfx.setFont(fnt3);
				gfx.setColor(Color.white);
				gfx.drawString("Score: " + score + "         Level: " + level + "         PONG!!!", 10, 25);
				gfx.fillRect(0, 28, WIDTH, 2);
				p1.draw(gfx);
				p2.draw(gfx);
				b1.draw(gfx);
			}
		}
		
		if(!gameStarted) {
			Font fnt = new Font("arial", 10, 75);
			Font fnt2 = new Font("arial", 10, 30);
			gfx.setColor(Color.white);
			gfx.setFont(fnt);
			gfx.drawString("Pong", 280, 100);
			gfx.setFont(fnt2);
			gfx.drawString("Click and Press Enter to Begin!", 170, 160);
			gfx.drawString("Use the Up and Down keys to try to hit the", 100, 225);
			gfx.drawString("ball without it touching the side!", 165, 260);
		}
		
		g.drawImage(img, 0, 0, this);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void run() {
		for(;;) {
			if(gameStarted) {
			p1.move();
			p2.move();
			b1.move();
			b1.checkPaddleCollision(p1, p2);
			}
			
			if(score % 5 == 0) {
				level = (score / 5) + 1;
			}
			
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(true);
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(true);
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			p1.setUpAccel(false);
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(false);
		} else if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			gameStarted = true;
			b1.x = 350;
			b1.xVel = b1.getRandomSpeed() * b1.getRandomDirection();
			score = 0;
		}
	}

	public void keyTyped(KeyEvent e) {
		
	}
	
	public static void main(String args[]) {
		new Tennis();
	}

}
