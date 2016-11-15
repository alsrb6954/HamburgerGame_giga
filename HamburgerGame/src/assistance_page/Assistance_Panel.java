package assistance_page;

import javax.swing.JPanel;


abstract public class Assistance_Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	abstract public void gameStart();
	public void gameMaxScore(int score){}
}
