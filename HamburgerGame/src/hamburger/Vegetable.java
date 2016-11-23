package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EFiveRandomLocation;
import constants.Constants_buger.ESevenRandomLocation;
import constants.Constants_buger.ESixRandomLocation;
import constants.Constants_buger.EVegetable;

public class Vegetable extends Material {
	private JLabel vegetable;
	private ImageIcon image;
	private static int count = 0;
	@Override
	public void initMaterial(int i, int n) {
		EVegetable[] eVegetable = EVegetable.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
		}
		switch (n) {
		case 0:
			vegetable.setBounds(EFiveRandomLocation.vegetable.getX(), EFiveRandomLocation.vegetable.getY(), image.getIconWidth(),
					image.getIconHeight());
			break;
		case 1:
			vegetable.setBounds(ESixRandomLocation.vegetable.getX(), ESixRandomLocation.vegetable.getY(), image.getIconWidth(),
					image.getIconHeight());	
			break;
		case 2:
			if(count == 0 || count == 3){
			vegetable.setBounds(ESevenRandomLocation.vegetable1.getX(), ESevenRandomLocation.vegetable1.getY(), image.getIconWidth(),
					image.getIconHeight());
				count++;
				if(count == 4){
					count = 0;
				}
			} else if(count == 1 || count == 2) {
				vegetable.setBounds(ESevenRandomLocation.vegetable2.getX(), ESevenRandomLocation.vegetable2.getY(), image.getIconWidth(),
						image.getIconHeight());
				count++;
			}
			break;
		default:
			break;
		}
	}
	public void initialize(){ count = 0; }
	public JLabel getMaterial() { return vegetable; }

}
