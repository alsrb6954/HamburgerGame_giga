package game_page;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Game_Select_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private ImageIcon image;

	public Game_Select_Panel(){
		TitledBorder threeTb = new TitledBorder(new LineBorder(Color.red), "Àç·á");
		threeTb.setTitleColor(Color.black);
		this.setBorder(threeTb);
		this.setLayout(null);
		
		image = new ImageIcon("rsc/selects/vegetable/cucumber.gif");
		JLabel vegetable = new JLabel(image);
		vegetable.setBounds(-30, 20, image.getIconWidth(), image.getIconHeight());
		add(vegetable);
		
		image = new ImageIcon("rsc/selects/vegetable/lettuce.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(130, 20, image.getIconWidth(), image.getIconHeight());
		add(vegetable);
		
		image = new ImageIcon("rsc/selects/vegetable/onion.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(300, 20, image.getIconWidth(), image.getIconHeight());
		add(vegetable);
		
		image = new ImageIcon("rsc/selects/vegetable/paprika.gif");
		vegetable = new JLabel(image);
		vegetable.setBounds(450, 20, image.getIconWidth(), image.getIconHeight());
		add(vegetable);
		
	}
}
