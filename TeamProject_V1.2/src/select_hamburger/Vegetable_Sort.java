package select_hamburger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_buger_images.EVegetable_Sort;

public class Vegetable_Sort extends Material_Sort {
	ImageIcon image;
	JLabel vegetable;
	public void init(){
		for(EVegetable_Sort eVegetable : EVegetable_Sort.values()){
			image = new ImageIcon(eVegetable.getImg());
			vegetable = new JLabel(image);
			vegetable.setBounds(0, 20, image.getIconWidth(), image.getIconHeight());
		}
	}
	public JLabel getLabel2(){
		image = new ImageIcon("rsc/selects/vegetable/lettuce.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(160, 20, image.getIconWidth(), image.getIconHeight());
		return vegetable;
	}
	public JLabel getLabel3(){
		image = new ImageIcon("rsc/selects/vegetable/onion.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(330, 20, image.getIconWidth(), image.getIconHeight());
		return vegetable;
	}
	public JLabel getLabel4(){
		image = new ImageIcon("rsc/selects/vegetable/paprika.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(480, 20, image.getIconWidth(), image.getIconHeight());
		return vegetable;
	}
	@Override
	public JLabel getLabel1() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
