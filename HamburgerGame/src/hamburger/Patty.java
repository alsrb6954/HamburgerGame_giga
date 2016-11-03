package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EPatty;
import constants.Constants_buger.ERandomLocation;
import data_managements.ConfirmQueue;
import data_managements.ConfirmStack;

public class Patty extends Material {
	private JLabel patty;
	private ImageIcon image;
	private ConfirmStack stack = new ConfirmStack();
	private ConfirmQueue queue = new ConfirmQueue();

	@Override
	public void initMaterial(int i, int n) {
		EPatty[] ePatty = EPatty.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
		}
		patty.setBounds(ERandomLocation.patty.getX(), ERandomLocation.patty.getY(), image.getIconWidth(),
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
		return patty;
	}
}
