package game_page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import constants.Constants;
import constants.Constants.*;
import hamburger.*;

public class Game_RandomHamburger_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel bottomBread;
	JLabel material;
	private ImageIcon image;
	
	
//	ImageIcon icon = new ImageIcon("rsc/시작페이지(햄버거.gif");
//	public void paintComponent(Graphics g) {
//		Dimension d = getSize();
//		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null); 
//        setOpaque(false);//그림을 표시하게 설정,투명하게 조절
//        super.paintComponent(g);
//	 }
	public Game_RandomHamburger_Panel() {
		TitledBorder line = new TitledBorder(new LineBorder(Color.black), "랜덤햄버거");
		line.setTitleColor(Color.red);
		this.setBorder(line);
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3까지의 숫자 랜덤 생성 메소드
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
	public void makeHamburger(){
		// 위에빵
		TopBread topBread = new TopBread(randomProduct());
		material = topBread.getMaterial();
		this.add(material);
		// 토핑
		Topping topping = new Topping(randomProduct());
		material = topping.getMaterial();
		this.add(material);
		// 패티
		Patty patty = new Patty(randomProduct());
		material = patty.getMaterial();
		this.add(material);
		// 야채
		Vegetable vegetable = new Vegetable(randomProduct());
		material = vegetable.getMaterial();
		this.add(material);
		// 아래빵
		this.underBread();
		// 음료수
		Drink drink = new Drink(randomProduct());
		material = drink.getMaterial();
		this.add(material);
	}

	// 밑빵 메소드
	public void underBread() {
		image = new ImageIcon("rsc/random/bottomBread.gif");
		bottomBread = new JLabel(image);
		bottomBread.setBounds(5, 150, image.getIconWidth(), image.getIconHeight());
		add(bottomBread);
	}
}
