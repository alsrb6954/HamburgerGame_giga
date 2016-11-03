package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import component.ConfirmStack;
import constants.Constants.ERandomLocation;
import constants.Constants.ETopping;

public class Topping extends Material {
	private JLabel topping;
	private ImageIcon image;
	ConfirmStack stack = new ConfirmStack();
	
	@Override
	public void initMaterial(int i, int n) {
		ETopping[] eTopping = ETopping.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eTopping[j].getImg());
			topping = new JLabel(image);
		}
		topping.setBounds(ERandomLocation.topping.getX(), ERandomLocation.topping.getY(), image.getIconWidth(),
				image.getIconHeight());
		stack.push(i, n);
	}

	public JLabel getMaterial() {
		return topping;
	}

}
