/**
 * @Project_Name Java Pong Game
 */
package hoang_anh.practice.panel;

import javax.swing.JPanel;

import hoang_anh.practice.panel.icommon.ICommon;

/**
 * @author Hoang Anh
 * @since 25 thg 1, 2021
 * @version 1.0
 */
@SuppressWarnings("serial")
public abstract class BasePanel extends JPanel implements ICommon{
	public BasePanel() {
		init();
		addComponent();
		addEvent();
	}
}
