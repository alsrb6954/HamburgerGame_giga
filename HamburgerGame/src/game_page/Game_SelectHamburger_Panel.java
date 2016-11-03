package game_page;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_SelectPanel_Burger.EGameSelectHamburger;
import hamburger.Material;

public class Game_SelectHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material[];
	private Material currentMaterial;
	public Game_SelectHamburger_Panel(ImageIcon icon) {
		super(icon);
		material = new JLabel[6];
	}
	// 이전의 그려있는것이 있으면 지우고 다시 그려준다.
	public void initialize(){
		this.removeAll();
		// 아래빵 생성 
		currentMaterial = EGameSelectHamburger.values()[0].getMaterial();
		currentMaterial.initMaterial(0, 1);
		material[0] = currentMaterial.getMaterial();
		this.add(material[0]);
	}
	// 선택된 재료에 따라 햄버거 모양을 그려주는 메소드
	public void selectBurger(int q, int i){
		this.removeAll();
		currentMaterial = EGameSelectHamburger.values()[q].getMaterial();
		currentMaterial.initMaterial(i, 1);
		material[q] = currentMaterial.getMaterial();
		for(;q>=0;q--){ this.add(material[q]); }
	}

}
