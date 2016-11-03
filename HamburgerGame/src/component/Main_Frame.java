package component;

import java.awt.Dimension;
import javax.swing.JFrame;

import constants.Constants;
import constants.Constants.EMainFrame;

public class Main_Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	ViewController viewController;
	
	public Main_Frame(){
		this.setTitle(Constants.MAINFRAME_TITLE);
		this.setLocation(EMainFrame.X.getValue(),EMainFrame.Y.getValue());
		this.setPreferredSize(new Dimension(EMainFrame.W.getValue(),EMainFrame.H.getValue()));
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewController = new ViewController(this);
	}
}
