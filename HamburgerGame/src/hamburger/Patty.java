package hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger.EPatty;
import constants.Constants_buger.ESevenRandomLocation;
import constants.Constants_buger.ESixRandomLocation;
import constants.Constants_buger.EFiveRandomLocation;

public class Patty extends Material {
	private JLabel patty;
	private ImageIcon image;
	private static int count = 0;
	@Override
	public void initMaterial(int i, int n) {
		EPatty[] ePatty = EPatty.values();
		for (int j = 0; j <= i; j++) {
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
		}
		switch (n) {
		case 0:
			patty.setBounds(EFiveRandomLocation.patty.getX(), EFiveRandomLocation.patty.getY(), image.getIconWidth(),
					image.getIconHeight());
			break;
		case 1:
			if(count == 0 || count == 3){
				patty.setBounds(ESixRandomLocation.patty1.getX(), ESixRandomLocation.patty1.getY(), image.getIconWidth(),
					image.getIconHeight());
				count++;
				if(count == 4){
					count = 0;
				}
			} else if(count == 1 || count == 2){
				patty.setBounds(ESixRandomLocation.patty2.getX(), ESixRandomLocation.patty2.getY(), image.getIconWidth(),
						image.getIconHeight());
				count++;
			}
			break;
		case 2:
			if(count == 0 || count == 3){
				patty.setBounds(ESevenRandomLocation.patty1.getX(), ESevenRandomLocation.patty1.getY(), image.getIconWidth(),
					image.getIconHeight());
				count++;
				if(count == 4){
					count = 0;
				}
			} else if(count == 1 || count == 2){
				patty.setBounds(ESevenRandomLocation.patty2.getX(), ESevenRandomLocation.patty2.getY(), image.getIconWidth(),
						image.getIconHeight());
				count++;
			}
			break;
		default:
			break;
		}
	}
	public void initialize(){ count = 0; }
	public JLabel getMaterial() { return patty; }
}
