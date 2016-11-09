
package game_page;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_RandomPanel.EGameRandomHamburger;
import hamburger.*;
// 랜덤으로 햄버거가 생성되는 클래스
public class Game_RandomHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material;
	private Material currentMaterial;

	public Game_RandomHamburger_Panel(ImageIcon icon){
		super(icon);
	}
	// 이전의 그려있는것이 있으면 지우고 다시 그려준다.
	public void initialize() {
		this.removeAll();
		for(EGameRandomHamburger eGameRandomHamburger : EGameRandomHamburger.values()){
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomProduct(), 0);
			material = currentMaterial.getMaterial();
			this.add(material);
		}
	}

	// 0~3까지의 숫자 랜덤 생성 메소드
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
	@Override
	public void selectBurger(int q, int i) {}
}
