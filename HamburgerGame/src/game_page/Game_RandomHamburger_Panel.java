
package game_page;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_Hamburger.EGameHamburger;
import hamburger.*;
// �������� �ܹ��Ű� �����Ǵ� Ŭ����
public class Game_RandomHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material;
	private Material currentMaterial;
	private int randomNum;
	public Game_RandomHamburger_Panel(ImageIcon icon){
		super(icon);
	}
	// ������ �׷��ִ°��� ������ ����� �ٽ� �׷��ش�.
	public void initialize() {
		int a = 0;
		this.removeAll();
		for(EGameHamburger eGameRandomHamburger : EGameHamburger.values()){
			randomNum = randomProduct();
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomNum);
			if(a<5){
				currentMaterial.stackPush(randomNum);
			}
			material = currentMaterial.getMaterial();
			this.add(material);
			a++;
		}
	}

	// 0~3������ ���� ���� ���� �޼ҵ�
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
}
