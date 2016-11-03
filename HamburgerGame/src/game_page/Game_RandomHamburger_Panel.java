
package game_page;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import hamburger.*;

public class Game_RandomHamburger_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel material;
	private Material currentMaterial;

	 ImageIcon icon = new ImageIcon("rsc/버거쿡배경-3.gif");
	 public void paintComponent(Graphics g) {
	 Dimension d = getSize();
	 g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	 setOpaque(false);//그림을 표시하게 설정,투명하게 조절
	 super.paintComponent(g);
	}
	public Game_RandomHamburger_Panel() {
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3까지의 숫자 랜덤 생성 메소드
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}

	public void makeHamburger() {
		// 위에빵
		currentMaterial = new TopBread();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// 토핑
		currentMaterial = new Topping();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// 패티
		currentMaterial = new Patty();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// 야채
		currentMaterial = new Vegetable();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// 아래빵
		currentMaterial = new BottomBread();
		currentMaterial.initMaterial(0,0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// 음료수
		currentMaterial = new Drink();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
	}

}
