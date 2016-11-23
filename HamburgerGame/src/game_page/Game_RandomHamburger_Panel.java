
package game_page;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import constants.Constants_Hamburger.EGameHamburger;
import constants.Constants_Hamburger.EGameHamburgerSeven;
import constants.Constants_Hamburger.EGameHamburgerSix;
import hamburger.*;
// 랜덤으로 햄버거가 생성되는 클래스
public class Game_RandomHamburger_Panel extends Game_Panel_Piece {
	private static final long serialVersionUID = 1L;
	private JLabel material;
	private Material currentMaterial;
	private int randomNum;
	private Random random;
	private int num;
	public int getNum() { return num; }
	public Game_RandomHamburger_Panel(ImageIcon icon){
		super(icon);
		random = new Random();
	}
	// 이전의 그려있는것이 있으면 지우고 다시 그려준다.
	public void initialize() {
		this.removeAll();
		currentMaterial = new Patty();
		currentMaterial.initialize();
		currentMaterial = new Vegetable();
		currentMaterial.initialize();
		num = random.nextInt(3);
		if(num == 0){
			fiveHamburger();
		} else if(num == 1){
			sixHamburger();
		} else if(num == 2){
			sevenHamburger();
		}
	}

	// 0~3까지의 숫자 랜덤 생성 메소드
	public int randomProduct() {
		return random.nextInt(4);
	}
	
	public void fiveHamburger(){
		int a = 0;
		for(EGameHamburger eGameRandomHamburger : EGameHamburger.values()){
			randomNum = randomProduct();
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomNum, num);
			if(a<5){
				currentMaterial.stackPush(randomNum);
			}
			material = currentMaterial.getMaterial();
			this.add(material);
			a++;
		}
	}
	public void sixHamburger(){
		int a = 0;
		for(EGameHamburgerSix eGameRandomHamburger : EGameHamburgerSix.values()){
			randomNum = randomProduct();
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomNum, num);
			if(a<6){
				currentMaterial.stackPush(randomNum);
			}
			material = currentMaterial.getMaterial();
			this.add(material);
			a++;
		}
	}	
	public void sevenHamburger(){
		int a = 0;
		for(EGameHamburgerSeven eGameRandomHamburger : EGameHamburgerSeven.values()){
			randomNum = randomProduct();
			currentMaterial = eGameRandomHamburger.getMaterial();
			currentMaterial.initMaterial(randomNum, num);
			if(a<7){
				currentMaterial.stackPush(randomNum);
			}
			material = currentMaterial.getMaterial();
			this.add(material);
			a++;
		}
	}
}
