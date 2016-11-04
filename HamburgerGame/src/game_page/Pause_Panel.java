package game_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import frames.ViewController;


public class Pause_Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton replay = new JButton("재시작");
	private JButton keep = new JButton("이어하기");
	private JButton quit = new JButton("나가기");
	private ImageIcon icon = new ImageIcon("rsc/panelImg/003.gif");
	private ViewController viewController;
	public Pause_Panel(ViewController viewController){
		this.viewController = viewController;
		setLayout(null);
		
		replay.setBounds(140,300,100,50);
		add(replay);
		
		keep.setBounds(250,300,100,50);
		add(keep);
		
		quit.setBounds(360,300,100,50);
		add(quit);
		
		//사건 처리를 위해
		replay.addActionListener(new SelectListener());
		keep.addActionListener(new SelectListener());
		quit.addActionListener(new SelectListener());
		
		setPreferredSize(new Dimension(700,700));
	}
		
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		
	}
	
		private class SelectListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				// 재시작을 눌렀을 때 다시 게임 시작
				if(event.getSource() == replay)
				{
					viewController.replayGamePanel();
				}
				
				// 이어하기를 눌렀을 때
				if(event.getSource() == keep)
				{
					viewController.keepGamePanel();
				}
				
				// 나가기 눌렀을 때 시스템 종료
				if(event.getSource() == quit)
				{
					System.exit(0);
				}
			}
		}
}
