package select_hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Patty_Sort extends Material_Sort {
	ImageIcon image;
	JLabel patty;
	@Override
	public JLabel getLabel1() {
		image = new ImageIcon("rsc/selects/patty/curryPatty.gif");
		patty = new JLabel(image);
		 patty.setBounds(0, 20, image.getIconWidth(), image.getIconHeight());
		return patty;
	}

	@Override
	public JLabel getLabel2() {
		image = new ImageIcon("rsc/selects/patty/hanwooPatty.gif");
		patty = new JLabel(image);
		patty.setBounds(150, 20, image.getIconWidth(), image.getIconHeight());
		return patty;
	}

	@Override
	public JLabel getLabel3() {
		image = new ImageIcon("rsc/selects/patty/meatPatty.gif");
		patty = new JLabel(image);
		patty.setBounds(300, 20, image.getIconWidth(), image.getIconHeight());
		return patty;
	}

	@Override
	public JLabel getLabel4() {
		image = new ImageIcon("rsc/selects/patty/spicyPatty.gif");
		patty = new JLabel(image);
		patty.setBounds(450, 20, image.getIconWidth(), image.getIconHeight());
		return patty;
	}

	

}
