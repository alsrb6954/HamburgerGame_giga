package select_hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Drink_Sort extends Material_Sort {
	ImageIcon image;
	JLabel drink;
	@Override
	public JLabel getLabel1() {
		image = new ImageIcon("rsc/selects/Drink/drinkCider.gif");
		drink = new JLabel(image);
		drink.setBounds(10, 20, image.getIconWidth(), image.getIconHeight());
		return drink;
	}

	@Override
	public JLabel getLabel2() {
		image = new ImageIcon("rsc/selects/Drink/drinkCola.gif");
		drink = new JLabel(image);
		drink.setBounds(170, 20, image.getIconWidth(), image.getIconHeight());
		return drink;
	}

	@Override
	public JLabel getLabel3() {
		image = new ImageIcon("rsc/selects/Drink/drinkFanta.gif");
		drink = new JLabel(image);
		drink.setBounds(330, 20, image.getIconWidth(), image.getIconHeight());
		return drink;
	}

	@Override
	public JLabel getLabel4() {
		image = new ImageIcon("rsc/selects/Drink/drinkGrape.gif");
		drink = new JLabel(image);
		drink.setBounds(490, 20, image.getIconWidth(), image.getIconHeight());
		return drink;
	}

	

}
