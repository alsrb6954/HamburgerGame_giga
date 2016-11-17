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
	private int score;
	// 배경을 그려주고 최대점수를 적어주는 페이트 메소드
	public void paintComponent(Graphics g) {
		ImageIcon icon = new ImageIcon("rsc/panelImg/end_Background.gif");
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		
		g.setFont(new Font("Defualt", Font.BOLD, 50));
		g.setColor(Color.green);
		g.drawString("MAXSCORE : " + score, 40, 200);
	}
	
	public End_Panel(ViewController viewController){
		this.viewController = viewController;
		setLayout(null);
		
		for(EEndPanelButton eEndPanelButton: EEndPanelButton.values()){
			ImageIcon img = new ImageIcon(eEndPanelButton.getButtonImg());
			ImageIcon img2 = new ImageIcon(eEndPanelButton.getButtonImg2());
			JButton button = new JButton();
			button.setIcon(img);
			button.setRolloverIcon(img2);
			button.setPressedIcon(img2);
			button.addActionListener(actionHandler);
			button.setActionCommand(eEndPanelButton.toString());
			button.setBounds(eEndPanelButton.getX(), eEndPanelButton.getY(), eEndPanelButton.getW(),
					eEndPanelButton.getH());
			this.add(button);
		}
	}
	// 최대 점수가 들어 오면 점수를 저장해준다.
	public void gameMaxScore(int score){
		this.score = score;
	}
	// 게임을 시작하는 메소드
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
