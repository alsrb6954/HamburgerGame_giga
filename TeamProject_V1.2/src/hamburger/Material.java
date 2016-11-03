package hamburger;

import javax.swing.JLabel;

public abstract class Material {
	public Material() {}

	// 숫자에 맞게 레이블에 재료 이미지 입히는 메소드
	// i는 햄버거 종류, n은 랜덤버거인지 선택버거인지 구분
	abstract public void initMaterial(int i, int n);
	// 이미지 입힌 레이블 반환
	abstract public JLabel getMaterial();
}
