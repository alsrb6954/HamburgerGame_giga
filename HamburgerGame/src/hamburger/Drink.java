package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EDrink;
import constants.Constants_buger.EFiveRandomLocation;

public class Drink extends Material {
	private JLabel drink;
	private ImageIcon image;
	@Override
	public void initMaterial(int i, int n) {
		EDrink[] eDrink = EDrink.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eDrink[j].getImg());
			drink = new JLabel(image);
		}
		drink.setBounds(EFiveRandomLocation.drink.getX(), EFiveRandomLocation.drink.getY(), image.getIconWidth(),
				image.getIconHeight());
	}

	public JLabel getMaterial() { return drink; }
}
