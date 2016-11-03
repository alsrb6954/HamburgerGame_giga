package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants.ERandomLocation;
import constants.Constants.EVegetable;

public class Vegetable {
	private JLabel vegetable;
	private ImageIcon image;

	public Vegetable(int i) {
		EVegetable[] eVegetable = EVegetable.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
		}
		vegetable.setBounds(ERandomLocation.vegetable.getX(), ERandomLocation.vegetable.getY(), image.getIconWidth(), image.getIconHeight());
	}

	public JLabel getMaterial() {
		return vegetable;
	}
}
