package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.ERandomLocation;
import constants.Constants_buger.EVegetable;
import data_managements.ConfirmQueue;
import data_managements.ConfirmStack;

public class Vegetable extends Material {
	private JLabel vegetable;
	private ImageIcon image;
	private ConfirmStack stack = new ConfirmStack();
	private ConfirmQueue queue = new ConfirmQueue();

	@Override
	public void initMaterial(int i, int n) {
		EVegetable[] eVegetable = EVegetable.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
		}
		vegetable.setBounds(ERandomLocation.vegetable.getX(), ERandomLocation.vegetable.getY(), image.getIconWidth(),
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
		return vegetable;
	}

}
