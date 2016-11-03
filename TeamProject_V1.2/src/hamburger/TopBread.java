package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import component.ConfirmStack;
import constants.Constants.ERandomLocation;
import constants.Constants_buger_images.ETopBread;

public class TopBread extends Material {
	private JLabel topBread;
	private ImageIcon image;
	ConfirmStack stack = new ConfirmStack();

	@Override
	public void initMaterial(int i, int n) {
		ETopBread[] eTopBread = ETopBread.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eTopBread[j].getImg());
			topBread = new JLabel(image);
		}
		topBread.setBounds(ERandomLocation.topBread.getX(), ERandomLocation.topBread.getY(), image.getIconWidth(),
				image.getIconHeight());
		stack.push(i, n);
	}

	public JLabel getMaterial() {
		return topBread;
	}

}
