/**
 * @Project_Name Java Pong Game
 */
package hoang_anh.practice.logic.component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
public class Paddle extends Rectangle {
	int id;
	int yMoveSpeed;
	
	public Paddle(int x, int y, int paddleWidth, int paddleHeight, int k) {
		super(x, y, paddleWidth, paddleHeight);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent evt) {
		
	}
	
	public void keyReleased(KeyEvent evt) {
		
	}
	
	public void setYDirection() {
		
	}
	
	public void move() {
		
	}
	
	public void draw(Graphics g) {
		if(id == 1) {
			g.setColor(Color.blue);
		} else {
			g.setColor(Color.red);
		}
		g.fillRect(x, y, width, height);
	}
}
