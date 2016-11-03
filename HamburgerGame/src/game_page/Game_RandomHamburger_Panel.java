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
	
//	ImageIcon icon = new ImageIcon("rsc/시작페이지(햄버거.gif");
//	public void paintComponent(Graphics g) {
//		Dimension d = getSize();
//		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null); 
//        setOpaque(false);//그림을 표시하게 설정,투명하게 조절
//        super.paintComponent(g);
//	 }
	public Game_RandomHamburger_Panel() {
		
		TitledBorder line = new TitledBorder(new LineBorder(Color.black), "랜덤햄버거");
		line.setTitleColor(Color.red);
		this.setBorder(line);
		this.setLayout(null);
		this.makeHamburger();
	}

	// 0~3까지의 숫자 랜덤 생성 메소드
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

	// 밑빵 메소드
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

	// 패티 메소드
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

	// 토핑 선택 메소드
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
	// 위에 빵 선택 메소드
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
	// 음료 선택
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
