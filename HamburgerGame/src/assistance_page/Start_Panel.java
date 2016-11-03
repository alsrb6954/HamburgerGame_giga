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
			g.drawString("↑", EStartPanel.drawX.getValue(), EStartPanel.drawY.getValue());
		else // 아닐경우
			g.drawString("↑", EStartPanel.drawX1.getValue(), EStartPanel.drawY1.getValue());
	}

	private class IntroKeyEvent implements KeyListener {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 37) { select = 0; } //왼쪽키
			else if (e.getKeyCode() == 39) { select = 1; } // 오른쪽키
			else if (e.getKeyCode() == 10) {// 엔터 키
				// 엔터를 누를경우에 게임시작
				if (select == 0)
					gameStart();
				else if (select == 1) // 화살표가 Quit에 위치한 상태일때
					System.exit(0); // 프로그램 종료
			}
			// 패널을 다시 그려준다.
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {}
		@Override
		public void keyTyped(KeyEvent e) {}
	}
}
