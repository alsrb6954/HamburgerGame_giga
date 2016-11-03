package assistance_page;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import constants.Constants.EStartPanel;
import frames.ViewController;

public class Start_Panel extends Assistance_Panel {
	private static final long serialVersionUID = 1L;
	private int select = 0;
	private Image background_Image;
	private ViewController viewController;
	
	public Start_Panel(ViewController viewController) {
		this.viewController = viewController;
		background_Image = Toolkit.getDefaultToolkit().getImage(EStartPanel.background.getBackgroundName());
		this.addKeyListener(new IntroKeyEvent());
	}

	public void gameStart() { viewController.showGamePanel(this); }

	@Override
	public void paint(Graphics g) {
		g.drawImage(background_Image, EStartPanel.X.getValue(), EStartPanel.Y.getValue(), 
				EStartPanel.W.getValue(), EStartPanel.H.getValue(), this);
		g.setFont(new Font("myFont", Font.BOLD, EStartPanel.Font.getValue()));
		g.setColor(Color.black);
		if (select == 0)
			g.drawString("��", EStartPanel.drawX.getValue(), EStartPanel.drawY.getValue());
		else // �ƴҰ��
			g.drawString("��", EStartPanel.drawX1.getValue(), EStartPanel.drawY1.getValue());
	}

	private class IntroKeyEvent implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 37) { select = 0; } //����Ű
			else if (e.getKeyCode() == 39) { select = 1; } // ������Ű
			else if (e.getKeyCode() == 10) {// ���� Ű
				// ���͸� ������쿡 ���ӽ���
				if (select == 0)
					gameStart();
				else if (select == 1) // ȭ��ǥ�� Quit�� ��ġ�� �����϶�
					System.exit(0); // ���α׷� ����
			}
			// �г��� �ٽ� �׷��ش�.
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
	}
}
