package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import component.ConfirmStack;
import constants.Constants_buger_images.EDrink;
import constants.Constants.ERandomLocation;

public class Drink extends Material {
	private JLabel drink;
	private ImageIcon image;
	ConfirmStack stack = new ConfirmStack();
	
	@Override
	public void initMaterial(int i, int n) {
		EDrink[] eDrink = EDrink.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eDrink[j].getImg());
			drink = new JLabel(image);
		}
		drink.setBounds(ERandomLocation.drink.getX(), ERandomLocation.drink.getY(), image.getIconWidth(),
				image.getIconHeight());
		stack.push(i, n);
	}

	public JLabel getMaterial() {
		return drink;
	}
}
