package game_page;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import frames.ViewController;


public class Pause_Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton replay = new JButton("�����");
	private JButton keep = new JButton("�̾��ϱ�");
	private JButton quit = new JButton("������");
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
		
		//��� ó���� ����
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
				// ������� ������ �� �ٽ� ���� ����
				if(event.getSource() == replay)
				{
					viewController.replayGamePanel();
				}
				
				// �̾��ϱ⸦ ������ ��
				if(event.getSource() == keep)
				{
					viewController.keepGamePanel();
				}
				
				// ������ ������ �� �ý��� ����
				if(event.getSource() == quit)
				{
					System.exit(0);
				}
			}
		}
}
