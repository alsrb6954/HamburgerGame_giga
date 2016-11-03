package game_page;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import component.ArrayCircleQueue;
import constants.Constants_buger_images.EDrink_Sort;
import constants.Constants_buger_images.EPatty_Sort;
import constants.Constants_buger_images.ETopBread_Sort;
import constants.Constants_buger_images.EVegetable_Sort;



public class Game_Select_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	ImageIcon image;
	JLabel material;
	ArrayCircleQueue q = new ArrayCircleQueue(6);
	
	public Game_Select_Panel(){
		TitledBorder threeTb = new TitledBorder(new LineBorder(Color.red), "Àç·á");
		threeTb.setTitleColor(Color.black);
		this.setBorder(threeTb);
		this.setLayout(null);
		//this.addKeyListener(new IntroKeyEvent());
//		for(int i = 0; i<5;i++){
//			q.enQueue(i);
//		}
		
		vegeTable();
	}
	
	public void vegeTable(){
		for(EVegetable_Sort eVegetable : EVegetable_Sort.values()){
			image = new ImageIcon(eVegetable.getImg());
			material = new JLabel(image);
			material.setBounds(eVegetable.getX(), eVegetable.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}
	public void patty(){
		this.removeAll();
		for(EPatty_Sort ePatty : EPatty_Sort.values()){
			image = new ImageIcon(ePatty.getImg());
			material = new JLabel(image);
			material.setBounds(ePatty.getX(), ePatty.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}
	public void topping(){
		this.removeAll();
		for(ETopBread_Sort eTopping : ETopBread_Sort.values()){
			image = new ImageIcon(eTopping.getImg());
			material = new JLabel(image);
			material.setBounds(eTopping.getX(), eTopping.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}
	public void topBread(){
		this.removeAll();
		for(ETopBread_Sort eTopBread : ETopBread_Sort.values()){
			image = new ImageIcon(eTopBread.getImg());
			material = new JLabel(image);
			material.setBounds(eTopBread.getX(), eTopBread.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}
	public void drink(){
		this.removeAll();
		for(EDrink_Sort eDrink : EDrink_Sort.values()){
			image = new ImageIcon(eDrink.getImg());
			material = new JLabel(image);
			material.setBounds(eDrink.getX(), eDrink.getY(), image.getIconWidth(), image.getIconHeight());
			this.add(material);
		}
	}

	private class ButtonEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
//	private class IntroKeyEvent implements KeyListener {
//
//		@Override
//		public void keyPressed(KeyEvent e) {
//			if (e.getKeyCode() == 10) {
//				//int i = q.deQueue();
//				System.out.println(1);
//				if (i == 0) {
//					vegeTable();
//				} else if (i == 1) {
//					patty();
//				} else if (i == 2) {
//					topping();
//				} else if (i == 3) {
//					topBread();
//				} else if (i == 4) {
//					drink();
//				}
//			}
//			repaint();
//		}
//
//		@Override
//		public void keyReleased(KeyEvent e) {
//		}
//
//		@Override
//		public void keyTyped(KeyEvent e) {
//		}
//	}
}
