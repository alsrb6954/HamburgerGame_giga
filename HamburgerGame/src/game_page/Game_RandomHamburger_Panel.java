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
	
	
//	ImageIcon icon = new ImageIcon("rsc/����������(�ܹ���.gif");
//	public void paintComponent(Graphics g) {
//		Dimension d = getSize();
//		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null); 
//        setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
//        super.paintComponent(g);
//	 }
	public Game_RandomHamburger_Panel() {
		TitledBorder line = new TitledBorder(new LineBorder(Color.black), "�����ܹ���");
		line.setTitleColor(Color.red);
		this.setBorder(line);
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3������ ���� ���� ���� �޼ҵ�
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
	public void makeHamburger(){
		// ������
		TopBread topBread = new TopBread(randomProduct());
		material = topBread.getMaterial();
		this.add(material);
		// ����
		Topping topping = new Topping(randomProduct());
		material = topping.getMaterial();
		this.add(material);
		// ��Ƽ
		Patty patty = new Patty(randomProduct());
		material = patty.getMaterial();
		this.add(material);
		// ��ä
		Vegetable vegetable = new Vegetable(randomProduct());
		material = vegetable.getMaterial();
		this.add(material);
		// �Ʒ���
		this.underBread();
		// �����
		Drink drink = new Drink(randomProduct());
		material = drink.getMaterial();
		this.add(material);
	}

	// �ػ� �޼ҵ�
	public void underBread() {
		image = new ImageIcon("rsc/random/bottomBread.gif");
		bottomBread = new JLabel(image);
		bottomBread.setBounds(5, 150, image.getIconWidth(), image.getIconHeight());
		add(bottomBread);
	}
}
