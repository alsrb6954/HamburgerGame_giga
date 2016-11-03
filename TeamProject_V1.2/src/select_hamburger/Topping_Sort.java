package select_hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Topping_Sort extends Material_Sort {
	JLabel topping;
	ImageIcon image;
	@Override
	public JLabel getLabel1() {
		image = new ImageIcon("rsc/selects/topping/cheese.gif");
		topping = new JLabel(image);
		topping.setBounds(0, 20, image.getIconWidth(), image.getIconHeight());
		return topping;
	}

	@Override
	public JLabel getLabel2() {
		image = new ImageIcon("rsc/selects/topping/egg.gif");
		topping = new JLabel(image);
		topping.setBounds(170, 20, image.getIconWidth(), image.getIconHeight());
		return topping;
	}

	@Override
	public JLabel getLabel3() {
		image = new ImageIcon("rsc/selects/topping/mushroom.gif");
		topping = new JLabel(image);
		topping.setBounds(330, 20, image.getIconWidth(), image.getIconHeight());
		return topping;
	}

	@Override
	public JLabel getLabel4() {
		image = new ImageIcon("rsc/selects/topping/tomato.gif");
		topping = new JLabel(image);
		topping.setBounds(490, 20, image.getIconWidth(), image.getIconHeight());
		return null;
	}

	

}
