package game_page;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_SelectPanel.*;


// 선택해야할 재료가 나오는 클래스
public class Game_Select_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private ImageIcon image;
	private JLabel material;
	
	public Game_Select_Panel(ImageIcon icon){
		super(icon);
	}
	// 이전의 그려있는것이 있으면 지우고 다시 그려준다.
	public void initialize(){
		this.removeAll();
		for(EVegetable_Sort eVegetable : EVegetable_Sort.values()){
			image = new ImageIcon(eVegetable.getImg());
			material = new JLabel(image);
			material.setBounds(eVegetable.getX(), eVegetable.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}
	// 넘오온 원형큐의 따라 재료를 선택해주는 메소드
	@Override
	public void selectBurger(int q, int i, int num) {
		this.removeAll();
		switch (num) {
		case 0: fiveSelectBuger(q);
			break;
		case 1: sixSelectBuger(q);		
			break;
		case 2: sevenSelectBuger(q);
			break;
		default:
			break;
		}
	}
	
	private void fiveSelectBuger(int q){
		switch(q){
		case 1:
			for(EPatty_Sort ePatty : EPatty_Sort.values()){
				image = new ImageIcon(ePatty.getImg());
				material = new JLabel(image);
				material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 2:
			for(ETopping_Sort eTopping : ETopping_Sort.values()){
				image = new ImageIcon(eTopping.getImg());
				material = new JLabel(image);
				material.setBounds(eTopping.getX(), eTopping.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 3:
			for(ETopBread_Sort eTopBread : ETopBread_Sort.values()){
				image = new ImageIcon(eTopBread.getImg());
				material = new JLabel(image);
				material.setBounds(eTopBread.getX(), eTopBread.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 4:
			for(EDrink_Sort eDrink : EDrink_Sort.values()){
				image = new ImageIcon(eDrink.getImg());
				material = new JLabel(image);
				material.setBounds(eDrink.getX(), eDrink.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		default: 
			break;
		}
	}
	private void sixSelectBuger(int q){
		switch(q){
		case 1:
			for(EPatty_Sort ePatty : EPatty_Sort.values()){
				image = new ImageIcon(ePatty.getImg());
				material = new JLabel(image);
				material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 2:
			for(ETopping_Sort eTopping : ETopping_Sort.values()){
				image = new ImageIcon(eTopping.getImg());
				material = new JLabel(image);
				material.setBounds(eTopping.getX(), eTopping.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 3:
			for(EPatty_Sort ePatty : EPatty_Sort.values()){
				image = new ImageIcon(ePatty.getImg());
				material = new JLabel(image);
				material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 4: 
			for(ETopBread_Sort eTopBread : ETopBread_Sort.values()){
				image = new ImageIcon(eTopBread.getImg());
				material = new JLabel(image);
				material.setBounds(eTopBread.getX(), eTopBread.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 5:
			for(EDrink_Sort eDrink : EDrink_Sort.values()){
				image = new ImageIcon(eDrink.getImg());
				material = new JLabel(image);
				material.setBounds(eDrink.getX(), eDrink.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		default: 
			break;
		}
	}
	private void sevenSelectBuger(int q){
		switch(q){
		case 1: 
			for(EPatty_Sort ePatty : EPatty_Sort.values()){
				image = new ImageIcon(ePatty.getImg());
				material = new JLabel(image);
				material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 2:
			for(ETopping_Sort eTopping : ETopping_Sort.values()){
				image = new ImageIcon(eTopping.getImg());
				material = new JLabel(image);
				material.setBounds(eTopping.getX(), eTopping.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 3:
			for(EPatty_Sort ePatty : EPatty_Sort.values()){
				image = new ImageIcon(ePatty.getImg());
				material = new JLabel(image);
				material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 4:
			for(EVegetable_Sort eVegetable : EVegetable_Sort.values()){
				image = new ImageIcon(eVegetable.getImg());
				material = new JLabel(image);
				material.setBounds(eVegetable.getX(), eVegetable.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 5:
			for(ETopBread_Sort eTopBread : ETopBread_Sort.values()){
				image = new ImageIcon(eTopBread.getImg());
				material = new JLabel(image);
				material.setBounds(eTopBread.getX(), eTopBread.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		case 6:
			for(EDrink_Sort eDrink : EDrink_Sort.values()){
				image = new ImageIcon(eDrink.getImg());
				material = new JLabel(image);
				material.setBounds(eDrink.getX(), eDrink.getY(), image.getIconWidth(), image.getIconHeight());
				this.add(material);
			}
			break;
		default: 
			break;
		}
	}
}