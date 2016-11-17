package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.ERandomLocation;
import constants.Constants_buger.ETopBread;

public class TopBread extends Material {
	private JLabel topBread;
	private ImageIcon image;

	@Override
	public void initMaterial(int i) {
		ETopBread[] eTopBread = ETopBread.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eTopBread[j].getImg());
			topBread = new JLabel(image);
		}
		topBread.setBounds(ERandomLocation.topBread.getX(), ERandomLocation.topBread.getY(), image.getIconWidth(),
				image.getIconHeight());
	}
	public JLabel getMaterial() { return topBread; }

}
