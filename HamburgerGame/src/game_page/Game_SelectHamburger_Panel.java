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
	// ������ �׷��ִ°��� ������ ����� �ٽ� �׷��ش�.
	public void initialize(){
		this.removeAll();
		// �Ʒ��� ���� 
		currentMaterial = EGameSelectHamburger.values()[0].getMaterial();
		currentMaterial.initMaterial(0, 1);
		material[0] = currentMaterial.getMaterial();
		this.add(material[0]);
	}
	// ���õ� ��ῡ ���� �ܹ��� ����� �׷��ִ� �޼ҵ�
	public void selectBurger(int q, int i){
		this.removeAll();
		currentMaterial = EGameSelectHamburger.values()[q].getMaterial();
		currentMaterial.initMaterial(i, 1);
		material[q] = currentMaterial.getMaterial();
		for(;q>=0;q--){ this.add(material[q]); }
	}

}
