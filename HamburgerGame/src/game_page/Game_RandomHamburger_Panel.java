
package game_page;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_RandomPanel.EGameRandomHamburger;
import hamburger.*;
// �������� �ܹ��Ű� �����Ǵ� Ŭ����
public class Game_RandomHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material;
	private Material currentMaterial;

	public Game_RandomHamburger_Panel(ImageIcon icon){
		super(icon);
	}
	// ������ �׷��ִ°��� ������ ����� �ٽ� �׷��ش�.
	public void initialize() {
		this.removeAll();
		for(EGameRandomHamburger eGameRandomHamburger : EGameRandomHamburger.values()){
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomProduct(), 0);
			material = currentMaterial.getMaterial();
			this.add(material);
		}
	}

	// 0~3������ ���� ���� ���� �޼ҵ�
	public int randomProduct() {
		Random random = new Random();
		return random.nextInt(4);
	}
	@Override
	public void selectBurger(int q, int i) {}
}
