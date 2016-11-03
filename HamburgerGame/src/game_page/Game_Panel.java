package game_page;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Game_Panel extends JPanel {
	private static final long serialVersionUID = 1L;

	public Game_Panel() {
		this.setBackground(Color.yellow);
		this.setLayout(null);
		
		Game_RandomHamburger_Panel randomHamburger_Panel = new Game_RandomHamburger_Panel();
		randomHamburger_Panel.setLayout(null);
		randomHamburger_Panel.setBounds(10,125,340,300);
		
		TitledBorder twoTb = new TitledBorder(new LineBorder(Color.blue),"선택 햄버거");
		twoTb.setTitleColor(Color.black);
		JPanel twopan = new JPanel();
		twopan.setLayout(null);
		twopan.setBorder(twoTb);
		twopan.setBounds(355,125,340,300);
		twopan.setBackground(Color.LIGHT_GRAY);
		
		TitledBorder threeTb = new TitledBorder(new LineBorder(Color.red),"재료");
		threeTb.setTitleColor(Color.black);
		JPanel threePan = new JPanel();
		threePan.setLayout(null);
		threePan.setBorder(threeTb);
		threePan.setBounds(10,440,685,180);
		threePan.setBackground(Color.LIGHT_GRAY);
		
		this.add(randomHamburger_Panel);
		this.add(twopan);
		this.add(threePan);
	}
}
