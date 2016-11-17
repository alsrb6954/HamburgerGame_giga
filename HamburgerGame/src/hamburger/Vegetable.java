package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.ERandomLocation;
import constants.Constants_buger.EVegetable;

public class Vegetable extends Material {
	private JLabel vegetable;
	private ImageIcon image;

	@Override
	public void initMaterial(int i) {
		EVegetable[] eVegetable = EVegetable.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
		}
		vegetable.setBounds(ERandomLocation.vegetable.getX(), ERandomLocation.vegetable.getY(), image.getIconWidth(),
				image.getIconHeight());
	}

	public JLabel getMaterial() { return vegetable; }

}
