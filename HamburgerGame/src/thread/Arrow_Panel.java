package thread;

import java.awt.*;
import javax.swing.*;


public class Arrow_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	Image arrow;
	private int x = 20, y = 10;
	Toolkit tool = this.getToolkit();
	public Arrow_Panel(){	
		arrow = tool.getImage("rsc/panelImg/arrow.gif");
	}
	public void paint(Graphics g) {
		g.drawImage(arrow, x, y, null);
		setOpaque(false);
	}
	
	public void setAX(int x) {
		this.x += x;
	}
	public int getAX() {
		return x;
	}
}
