package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import component.ConfirmStack;
import constants.Constants_buger_images.EPatty;
import constants.Constants.ERandomLocation;

public class Patty extends Material {
	private JLabel patty;
	private ImageIcon image;
	ConfirmStack stack = new ConfirmStack();

	@Override
	public void initMaterial(int i, int n) {
		EPatty[] ePatty = EPatty.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
		}
		patty.setBounds(ERandomLocation.patty.getX(), ERandomLocation.patty.getY(), image.getIconWidth(),
				image.getIconHeight());
		stack.push(i, n);
	}

	public JLabel getMaterial() {
		return patty;
	}
}
