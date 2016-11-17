package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EPatty;
import constants.Constants_buger.ERandomLocation;

public class Patty extends Material {
	private JLabel patty;
	private ImageIcon image;

	@Override
	public void initMaterial(int i) {
		EPatty[] ePatty = EPatty.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
		}
		patty.setBounds(ERandomLocation.patty.getX(), ERandomLocation.patty.getY(), image.getIconWidth(),
				image.getIconHeight());
	}

	public JLabel getMaterial() { return patty; }
}
