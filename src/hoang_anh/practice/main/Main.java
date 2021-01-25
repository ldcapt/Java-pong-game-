/**
 * @Project_Name Java Pong Game
 */
package hoang_anh.practice.main;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import hoang_anh.practice.frame.LauchFrame;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// set look and feel to system dependent
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LauchFrame().setVisible(true);
			}
		});
	}

}
