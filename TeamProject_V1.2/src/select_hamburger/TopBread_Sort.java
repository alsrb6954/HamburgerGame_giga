package select_hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TopBread_Sort extends Material_Sort {
	JLabel topBread;
	ImageIcon image;
	@Override
	public JLabel getLabel1() {
		image = new ImageIcon("rsc/selects/topBread/topBread1.gif");
		topBread = new JLabel(image);
		topBread.setBounds(0, 20, image.getIconWidth(), image.getIconHeight());
		return topBread;
	}

	@Override
	public JLabel getLabel2() {
		image = new ImageIcon("rsc/selects/topBread/topBread2.gif");
		topBread = new JLabel(image);
		topBread.setBounds(170, 20, image.getIconWidth(), image.getIconHeight());
		return topBread;
	}

	@Override
	public JLabel getLabel3() {
		image = new ImageIcon("rsc/selects/topBread/topBread3.gif");
		topBread = new JLabel(image);
		topBread.setBounds(330, 20, image.getIconWidth(), image.getIconHeight());
		return topBread;
	}

	@Override
	public JLabel getLabel4() {
		image = new ImageIcon("rsc/selects/topBread/topBread4.gif");
		topBread = new JLabel(image);
		topBread.setBounds(490, 20, image.getIconWidth(), image.getIconHeight());
		return topBread;
	}

	

}
