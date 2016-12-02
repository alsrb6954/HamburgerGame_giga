package game_page;

import javax.swing.JLabel;


import java.awt.Color;
import java.awt.Font;


// 타이머를 위한 클래스
public class Game_Timer extends Thread{
	private JLabel timer;
	public JLabel getTimer() { return timer; }
	private int num;
	
	public Game_Timer() {
		timer = new JLabel();
		Font font = new Font("myFont", Font.BOLD, 50);
		timer.setFont(font);
		timer.setForeground(Color.red);
		timer.setBounds(337, 110, 300, 50);
		initialize();
	}

	public void initialize() {
		num = 30;
	}

	public void run() {
		while (true) {
			timer.setText(Integer.toString(num));
			num--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}

			if (num == 0) {
				Game_Panel.gameOver();
			}
		}
	}
}
