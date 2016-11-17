package hamburger;

import javax.swing.JLabel;

import data_managements.ConfirmStack;

public abstract class Material {
	private ConfirmStack stack = new ConfirmStack();
	public Material() {}

	// 숫자에 맞게 레이블에 재료 이미지 입히는 메소드
	// i는 햄버거 종류
	abstract public void initMaterial(int i);
	// 이미지 입힌 레이블 반환
	abstract public JLabel getMaterial();
	public void stackPush(int i){ stack.push(i); }
}
