
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

	 ImageIcon icon = new ImageIcon("rsc/��������-3.gif");
	 public void paintComponent(Graphics g) {
	 Dimension d = getSize();
	 g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
	 setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
	 super.paintComponent(g);
	}
	public Game_RandomHamburger_Panel() {
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3������ ���� ���� ���� �޼ҵ�
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}

	public void makeHamburger() {
		// ������
		currentMaterial = new TopBread();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// ����
		currentMaterial = new Topping();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// ��Ƽ
		currentMaterial = new Patty();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// ��ä
		currentMaterial = new Vegetable();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// �Ʒ���
		currentMaterial = new BottomBread();
		currentMaterial.initMaterial(0,0);
		material = currentMaterial.getMaterial();
		this.add(material);
		// �����
		currentMaterial = new Drink();
		currentMaterial.initMaterial(randomProduct(), 0);
		material = currentMaterial.getMaterial();
		this.add(material);
	}

}
