package game_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import constants.Constants_PausePanel;
import constants.Constants_PausePanel.EGamePauseButton;
import frames.ViewController;


public class Game_Pause_Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private ViewController viewController;
	private SelectListener actionHandler = new SelectListener();
	public Game_Pause_Panel(ViewController viewController){
		this.viewController = viewController;
		setLayout(null);
		setBounds(Constants_PausePanel.X, Constants_PausePanel.Y, Constants_PausePanel.WIDTH, Constants_PausePanel.HIEGHT);
		
		for(EGamePauseButton eGamePauseButton: EGamePauseButton.values()){
			ImageIcon img = new ImageIcon(eGamePauseButton.getButtonImg());
			ImageIcon img2 = new ImageIcon(eGamePauseButton.getButtonImg2());
			JButton button = new JButton();
			button.setIcon(img);
			button.setRolloverIcon(img2);
			button.setPressedIcon(img2);
			button.addActionListener(actionHandler);
			button.setActionCommand(eGamePauseButton.toString());
			button.setBounds(eGamePauseButton.getX(), eGamePauseButton.getY(), eGamePauseButton.getW(),
					eGamePauseButton.getH());
			this.add(button);
		}
		
	}

	public void paintComponent(Graphics g) {}

	private class SelectListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ViewController.clickSound();
			// 재시작을 눌렀을 때 다시 게임 시작
			if (e.getActionCommand().equals(EGamePauseButton.values()[0].toString())) {
				viewController.replayGamePanel();
			}// 이어하기를 눌렀을 때
			else if (e.getActionCommand().equals(EGamePauseButton.values()[1].toString())) {
				viewController.keepGamePanel();
			}// 나가기 눌렀을 때 시스템 종료
			else if (e.getActionCommand().equals(EGamePauseButton.values()[2].toString())) {
				System.exit(0);
			}
		}
	}
}
