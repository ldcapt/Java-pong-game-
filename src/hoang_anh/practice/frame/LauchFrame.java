/**
 * @Project_Name Java Pong Game
 */
package hoang_anh.practice.frame;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hoang_anh.practice.panel.GamePanel;
import hoang_anh.practice.panel.icommon.ICommon;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public class LauchFrame extends JFrame implements ICommon{

	public static final int GAME_WIDTH = 1000;
	public static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
	public static final Dimension SCREEN_SIZE = new Dimension(LauchFrame.GAME_WIDTH, LauchFrame.GAME_HEIGHT);

	public static final Font fontHeader = new Font("Calibri", Font.BOLD, 36);
	public static final Font fontNormal = new Font("Calibri", Font.PLAIN, 16);

	private GamePanel gamePanel; 
	
	public LauchFrame() {
		init();
		addComponent();
		addEvent();
	}

	@Override
	public void init() {
		// init
		setTitle("Java Pong Game");
		setSize(GAME_WIDTH, GAME_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setLayout(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	@Override
	public void addComponent() {
		gamePanel = new GamePanel();
		add(gamePanel);
	}

	@Override
	public void addEvent() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Really?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		};
		addWindowListener(wa);
	}
}
