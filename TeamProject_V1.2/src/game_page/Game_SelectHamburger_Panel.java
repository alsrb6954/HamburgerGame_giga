package game_page;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hamburger.BottomBread;
import hamburger.Material;

public class Game_SelectHamburger_Panel extends JPanel {
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
	
	public Game_SelectHamburger_Panel() {
		
		this.setLayout(null);
		
		
		// �Ʒ��� ���� 
		currentMaterial = new BottomBread();
		currentMaterial.initMaterial(0, 1);
		material = currentMaterial.getMaterial();
		this.add(material);
	}

}
