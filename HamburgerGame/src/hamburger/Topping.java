package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EFiveRandomLocation;
import constants.Constants_buger.ETopping;

public class Topping extends Material {
	private JLabel topping;
	private ImageIcon image;
	
	@Override
	public void initMaterial(int i, int n) {
		ETopping[] eTopping = ETopping.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eTopping[j].getImg());
			topping = new JLabel(image);
		}
		topping.setBounds(EFiveRandomLocation.topping.getX(), EFiveRandomLocation.topping.getY(), image.getIconWidth(),
				image.getIconHeight());

	}

	public JLabel getMaterial() { return topping; }

}
