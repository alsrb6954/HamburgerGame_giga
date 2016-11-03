package game_page;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import constants.Constants.*;

public class Game_RandomHamburger_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel topBread, topping, patty, vegetable, underBread, drink;
	private ImageIcon image;
	
//	ImageIcon icon = new ImageIcon("rsc/����������(�ܹ���.gif");
//	public void paintComponent(Graphics g) {
//		Dimension d = getSize();
//		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null); 
//        setOpaque(false);//�׸��� ǥ���ϰ� ����,�����ϰ� ����
//        super.paintComponent(g);
//	 }
	public Game_RandomHamburger_Panel() {
		
		TitledBorder line = new TitledBorder(new LineBorder(Color.black), "�����ܹ���");
		line.setTitleColor(Color.red);
		this.setBorder(line);
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3������ ���� ���� ���� �޼ҵ�
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
	public void makeHamburger(){
		this.topBread();
		this.topping();
		this.patty();
		this.vegetable();
		this.underBread();
		this.drink();
	}

	// �ػ� �޼ҵ�
	public void underBread() {
		image = new ImageIcon("rsc/random/bottomBread.gif");
		underBread = new JLabel(image);
		underBread.setBounds(5, 150, image.getIconWidth(), image.getIconHeight());
		add(underBread);
	}
	
	public void vegetable() {
		int i = randomProduct();
		EVegetable[] eVegetable = EVegetable.values();
		for(int j = 0 ;j <= i ; j++){
			image = new ImageIcon(eVegetable[j].getImg());
			vegetable = new JLabel(image);
			vegetable.setBounds(EVegetable.location.getX(), EVegetable.location.getY(), image.getIconWidth(), image.getIconHeight());	
		}
		add(vegetable);
	}

	// ��Ƽ �޼ҵ�
	public void patty() {
		int i = randomProduct();
		EPatty[] ePatty = EPatty.values();
		for(int j = 0 ; j<=i ; j++){
			image = new ImageIcon(ePatty[j].getImg());
			patty = new JLabel(image);
			patty.setBounds(EPatty.location.getX(), EPatty.location.getY(), image.getIconWidth(), image.getIconHeight());	
		}
		add(patty);
	}

	// ���� ���� �޼ҵ�
	public void topping() {
		int i = randomProduct();
		ETopping[] eTopping = ETopping.values();
		for(int j = 0 ; j <= i ; j++){
			image = new ImageIcon(eTopping[j].getImg());
			topping = new JLabel(image);
			topping.setBounds(ETopping.location.getX(), ETopping.location.getY(), image.getIconWidth(), image.getIconHeight());	
		}
		add(topping);
	}
	// ���� �� ���� �޼ҵ�
	public void topBread() {
		int i = randomProduct();
		ETopBread[] eTopBread = ETopBread.values();
		for(int j = 0 ; j<=i ; j++){
			image = new ImageIcon(eTopBread[j].getImg());
			topBread = new JLabel(image);
			topBread.setBounds(ETopBread.location.getX(), ETopBread.location.getY(), image.getIconWidth(), image.getIconHeight());	
		}
		add(topBread);
	}
	// ���� ����
	public void drink() {
		int i = randomProduct();
		EDrink[] eDrink = EDrink.values();
		for(int j = 0 ; j<=i ; j++){
			image = new ImageIcon(eDrink[j].getImg());
			drink = new JLabel(image);
			drink.setBounds(EDrink.location.getX(), EDrink.location.getY(), image.getIconWidth(), image.getIconHeight());	
		}
		add(drink);
	}
}
