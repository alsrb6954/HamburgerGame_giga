package game_page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import component.LevelTest;

public class Game_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	ImageIcon icon = new ImageIcon("rsc/버거쿡배경-1.gif");

	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);// 그림을 표시하게 설정,투명하게 조절
		super.paintComponent(g);
	}

	public Game_Panel() {
		this.setLayout(null);
		Font f1 = new Font("myFont", Font.BOLD | Font.ITALIC, 50);
		LevelTest levelLable = new LevelTest();
		JLabel level = levelLable.getLevel();
		level.setFont(f1);
		level.setForeground(Color.GREEN);
		level.setBounds(500, 5, 300, 50);
		this.add(level);
		this.initGame();
	}

	// 게임을 초기 설정 해주는 메소드
	public void initGame() {
		// 랜덤햄버거 패널
		Game_RandomHamburger_Panel randomHamburger_Panel = new Game_RandomHamburger_Panel();
		randomHamburger_Panel.setLayout(null);
		randomHamburger_Panel.setBounds(10, 155, 340, 300);

		Game_SelectHamburger_Panel selectHamburger_Panel = new Game_SelectHamburger_Panel();
		selectHamburger_Panel.setLayout(null);
		selectHamburger_Panel.setBounds(355, 155, 340, 300);

		Game_Select_Panel select_Panel = new Game_Select_Panel();
		select_Panel.setLayout(null);
		select_Panel.setBounds(10, 470, 685, 180);

		this.add(randomHamburger_Panel);
		this.add(selectHamburger_Panel);
		this.add(select_Panel);
	}
}
