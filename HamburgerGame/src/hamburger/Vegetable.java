package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import component.ConfirmStack;
import constants.Constants.ERandomLocation;
import constants.Constants.EVegetable;

public class Vegetable extends Material {
	private JLabel vegetable;
	private ImageIcon image;
	ConfirmStack stack = new ConfirmStack();

	@Override
	public void initMaterial(int i, int n) {
		EVegetable[] eVegetable = EVegetable.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
		}
		vegetable.setBounds(ERandomLocation.vegetable.getX(), ERandomLocation.vegetable.getY(), image.getIconWidth(),
				image.getIconHeight());
		stack.push(i, n);
	}

	public JLabel getMaterial() {
		return vegetable;
	}

}
