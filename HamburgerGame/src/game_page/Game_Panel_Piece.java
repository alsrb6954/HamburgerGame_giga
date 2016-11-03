package game_page;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Game_Panel_Piece extends JPanel {
	private static final long serialVersionUID = 1L;
	ImageIcon icon;
	// 생성자 메소드로 자식 클래스한테 배경 이미지를 받는다.
	public Game_Panel_Piece(ImageIcon icon){
		this.icon = icon;
		this.setLayout(null);
	}
	// 각 패널들의 배경을 생성하는 메소드
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);//그림을 표시하게 설정,투명하게 조절
		super.paintComponent(g);
	}
	// 추상 메소드로 초기화와 선택버거의 추상화 메소드
	abstract public void initialize();
	abstract public void selectBurger(int q, int i);
}
