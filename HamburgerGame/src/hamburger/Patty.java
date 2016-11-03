package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import constants.Constants.EPatty;
import constants.Constants.ERandomLocation;

public class Patty {
	private JLabel patty;
	private ImageIcon image;

	public Patty(int i) {
		EPatty[] ePatty = EPatty.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
		}
		patty.setBounds(ERandomLocation.patty.getX(), ERandomLocation.patty.getY(), image.getIconWidth(), image.getIconHeight());
	}

	public JLabel getMaterial() {
		return patty;
	}
}
