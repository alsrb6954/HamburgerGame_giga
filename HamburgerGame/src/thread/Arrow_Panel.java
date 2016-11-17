package thread;

import java.awt.*;
import javax.swing.*;


public class Arrow_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image arrow;
	private int x = 20, y = 10;
	private Toolkit tool = this.getToolkit();
	
	public void setAX(int x) { this.x += x; }
	public int getAX() { return x; }
	
	public Arrow_Panel(){	
		arrow = tool.getImage("rsc/panelImg/arrow.gif");
	}
	// ȭ��ǥ�� �׷��ִ� ����Ʈ �޼ҵ�
	public void paint(Graphics g) {
		g.drawImage(arrow, x, y, null);
		setOpaque(false);
	}

}
