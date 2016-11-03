package game_page;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Game_Panel_Piece extends JPanel {
	private static final long serialVersionUID = 1L;
	ImageIcon icon;
	// ������ �޼ҵ�� �ڽ� Ŭ�������� ��� �̹����� �޴´�.
	public Game_Panel_Piece(ImageIcon icon){
		this.icon = icon;
		this.setLayout(null);
	}
	// �� �гε��� ����� �����ϴ� �޼ҵ�
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
		super.paintComponent(g);
	}
	// �߻� �޼ҵ�� �ʱ�ȭ�� ���ù����� �߻�ȭ �޼ҵ�
	abstract public void initialize();
	abstract public void selectBurger(int q, int i);
}
