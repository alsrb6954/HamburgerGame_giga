package game_page;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_Hamburger.EGameHamburger;
import constants.Constants_Hamburger.EGameHamburgerSeven;
import constants.Constants_Hamburger.EGameHamburgerSix;
import hamburger.Material;
// 사용자가 선택해서 만들어질 햄버거
public class Game_SelectHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material[];
	private Material currentMaterial;
	public Game_SelectHamburger_Panel(ImageIcon icon) {
		super(icon);
	}
	// 이전의 그려있는것이 있으면 지우고 다시 그려준다.
	public void initialize(){
		material = new JLabel[8];
		this.removeAll();
		// 아래빵 생성 
		currentMaterial = EGameHamburger.values()[5].getMaterial();
		currentMaterial.initMaterial(0, 5);
		material[0] = currentMaterial.getMaterial();
		this.add(material[0]);
	}
	// 선택된 재료에 따라 햄버거 모양을 그려주는 메소드
	public void selectBurger(int q, int selectNum, int num){
		this.removeAll();
		switch (num) {
		case 0: fiveSelectBuger(q, selectNum, num);
			break;
		case 1: sixSelectBuger(q, selectNum, num);		
			break;
		case 2: sevenSelectBuger(q, selectNum, num);
			break;
		default:
			break;
		}
	}
	public void fiveSelectBuger(int q, int selectNum, int num){
		currentMaterial = EGameHamburger.values()[5-q].getMaterial();
		currentMaterial.initMaterial(selectNum, num);
		material[q] = currentMaterial.getMaterial();
		for(;q>=0;q--){ this.add(material[q]); }
	}
	public void sixSelectBuger(int q, int selectNum, int num){
		currentMaterial = EGameHamburgerSix.values()[6-q].getMaterial();
		currentMaterial.initMaterial(selectNum, num);
		material[q] = currentMaterial.getMaterial();
		for(;q>=0;q--){ this.add(material[q]); }
	}
	public void sevenSelectBuger(int q, int selectNum, int num){
		currentMaterial = EGameHamburgerSeven.values()[7-q].getMaterial();
		currentMaterial.initMaterial(selectNum, num);
		material[q] = currentMaterial.getMaterial();
		for(;q>=0;q--){ this.add(material[q]); }
	}
}
