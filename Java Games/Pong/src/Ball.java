

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	double xVel, yVel, x, y;
	Tennis pong;
	
	public Ball(Tennis pong) {
		this.pong = pong;
		x = 350;
		y = 250;
		xVel = getRandomSpeed() * getRandomDirection();
		yVel = getRandomSpeed() * getRandomDirection();
	}
	
	public double getRandomSpeed() {
		return (Math.random() *3 + 1);
	}
	
	public int getRandomDirection() {
		int rand = (int) (Math.random() * 2);
		
		if(rand == 1) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval((int)x - 10, (int)y - 10, 20, 20);
	}
	
	public void checkPaddleCollision(Paddle p1, Paddle p2) {
		if(x <= 50 && x >= 30) {
			if(y >= p1.getY() && y <= p1.getY() + 80) {
				xVel = -xVel;
				pong.score++;
			}
		}
		else if (x >= 650 && x <= 670) {
			if(y >= p2.getY() && y <= p2.getY() + 80) 
				xVel = -xVel;
		}
	}
	
	public void move() {
		if(xVel > 0) {
		x += (xVel + pong.level);
		}
		else if(xVel < 0) {
		x += (xVel - pong.level);
		}
		y += yVel;
		
		if(y < 40)
			yVel = -yVel;
		if(y > 490)
			yVel = -yVel;
		if(x < 0) {
			xVel = 0;
		}
		if(x > 700) {
			xVel = 0;
		}
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}

}
