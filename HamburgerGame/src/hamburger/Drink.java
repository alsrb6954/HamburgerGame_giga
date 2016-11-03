package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants.EDrink;
import constants.Constants.ERandomLocation;

public class Drink {
	private JLabel drink;
	private ImageIcon image;

	public Drink(int i) {
		EDrink[] eDrink = EDrink.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eDrink[j].getImg());
			drink = new JLabel(image);
		}
		drink.setBounds(ERandomLocation.drink.getX(), ERandomLocation.drink.getY(), image.getIconWidth(), image.getIconHeight());
	}

	public JLabel getMaterial() {
		return drink;
	}
}
