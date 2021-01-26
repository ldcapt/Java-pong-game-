/**
 * @Project_Name Java Pong Game
 */
package hoang_anh.practice.panel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import hoang_anh.practice.frame.LauchFrame;
import hoang_anh.practice.logic.component.Ball;
import hoang_anh.practice.logic.component.Paddle;
import hoang_anh.practice.logic.component.Score;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class GamePanel extends BasePanel {

	private static final int BALL_DIAMETER = 20;
	private static final int PADDLE_WIDTH = 25;
	private static final int PADDLE_HEIGHT = 100;
	
	Image 	  image;
	Random 	  random;
	Graphics  graphics;
	Thread 	  gameThread;
	
	Paddle  paddle1;
	Paddle  paddle2;
	Ball    ball;
	Score 	score;
	
	@Override
	public void init() {
		ball    = new Ball();
		score 	= new Score(LauchFrame.GAME_WIDTH, LauchFrame.GAME_HEIGHT);
		
		this.setFocusable(true);
		this.setPreferredSize(LauchFrame.SCREEN_SIZE);
		this.initGameThread();
		this.setBackground(Color.black);
	}

	@Override
	public void addComponent() {
		newBall();
		newPaddles();
		
//		run();
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		KeyAdapter key = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);
			}
		};
		this.addKeyListener(key);
	}

	// ---------------------- Private Layer ----------------------  
	
	/**
	 * 
	 */
	private void newBall() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	private void newPaddles() {
		paddle1 = new Paddle(
					0,
					(LauchFrame.GAME_HEIGHT/ 2) - (PADDLE_HEIGHT/ 2),
					PADDLE_WIDTH,
					PADDLE_HEIGHT,
					1);
		
		paddle2 = new Paddle(
					LauchFrame.GAME_WIDTH - PADDLE_WIDTH,
					(LauchFrame.GAME_HEIGHT/ 2) - (PADDLE_HEIGHT/ 2),
					PADDLE_WIDTH,
					PADDLE_HEIGHT,
					2);
	}
	
	/**
	 * 
	 */
	public void paint(Graphics g) {
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image, 0, 0, this);
	}

	public void move() {
		
	}
	
	public void checkCollision() {
		
	}
	
	/**
	 * Basic game loop
	 */
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(true) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				this.move();
				this.checkCollision();
				repaint();
				delta--;
				System.out.println("Test");
			}
		}
	}
	
	/**
	 * @param g
	 */
	private void draw(Graphics g) {
		paddle1.draw(g);
		paddle2.draw(g);
		
	}

	private void initGameThread() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		gameThread = new Thread(runnable); 
		gameThread.start();
	}
	
}
