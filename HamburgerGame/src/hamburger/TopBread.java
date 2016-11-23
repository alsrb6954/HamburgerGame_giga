package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EFiveRandomLocation;
import constants.Constants_buger.ESevenRandomLocation;
import constants.Constants_buger.ESixRandomLocation;
import constants.Constants_buger.ETopBread;

public class TopBread extends Material {
	private JLabel topBread;
	private ImageIcon image;

	@Override
	public void initMaterial(int i, int n) {
		ETopBread[] eTopBread = ETopBread.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eTopBread[j].getImg());
			topBread = new JLabel(image);
		}
		switch (n) {
		case 0:
			topBread.setBounds(EFiveRandomLocation.topBread.getX(), EFiveRandomLocation.topBread.getY(), image.getIconWidth(),
					image.getIconHeight());
			break;
		case 1:
			topBread.setBounds(ESixRandomLocation.topBread.getX(), ESixRandomLocation.topBread.getY(), image.getIconWidth(),
					image.getIconHeight());
			break;
		case 2:
			topBread.setBounds(ESevenRandomLocation.topBread.getX(), ESevenRandomLocation.topBread.getY(), image.getIconWidth(),
					image.getIconHeight());
			break;

		default:
			break;
		}
	}
	public JLabel getMaterial() { return topBread; }

}
