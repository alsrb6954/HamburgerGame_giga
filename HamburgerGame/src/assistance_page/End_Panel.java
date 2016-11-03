package assistance_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import constants.Constants.EEndPanelButton;
import frames.ViewController;


public class End_Panel extends Assistance_Panel{
	private static final long serialVersionUID = 1L;
	private ViewController viewController;
	private SelectListener actionHandler = new SelectListener();
	
	public void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("rsc/panelImg/end_Background.gif");
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	}
	
	public End_Panel(ViewController viewController){
		this.viewController = viewController;
		setLayout(null);
		
		for(EEndPanelButton eEndPanelButton: EEndPanelButton.values()){
			ImageIcon img = new ImageIcon(eEndPanelButton.getButtonImg());
			JButton button = new JButton();
			button.setIcon(img);
			//button.setPressedIcon(img);
			button.addActionListener(actionHandler);
			button.setActionCommand(eEndPanelButton.toString());
			button.setBounds(eEndPanelButton.getX(), eEndPanelButton.getY(), eEndPanelButton.getW(),
					eEndPanelButton.getH());
			this.add(button);
		}
	}

	@Override
	public void gameStart() { viewController.showGamePanel(this); }
	
	private class SelectListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{	// 다시를 눌렀을 때 다시 게임 시작
			if(e.getActionCommand().equals("Replay")){ gameStart(); }
			// 끝을 눌렀을 때 시스템 종료
			if(e.getActionCommand().equals("Quit")){ System.exit(0); }
		}
	}

}
