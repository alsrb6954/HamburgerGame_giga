package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EDrink;
import data_managements.ConfirmQueue;
import data_managements.ConfirmStack;
import constants.Constants_buger.ERandomLocation;

public class Drink extends Material {
	private JLabel drink;
	private ImageIcon image;
	private ConfirmStack stack = new ConfirmStack();
	private ConfirmQueue queue = new ConfirmQueue();
	@Override
	public void initMaterial(int i, int n) {
		EDrink[] eDrink = EDrink.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eDrink[j].getImg());
			drink = new JLabel(image);
		}
		drink.setBounds(ERandomLocation.drink.getX(), ERandomLocation.drink.getY(), image.getIconWidth(),
				image.getIconHeight());
		switch (n) {
		case 0:stack.push(i);
			break;
		case 1:queue.enqueue(i);
			break;
		default:
			break;
		}
		
	}

	public JLabel getMaterial() {
		return drink;
	}
}
