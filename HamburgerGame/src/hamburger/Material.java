package hamburger;

import javax.swing.JLabel;

public abstract class Material {
	public Material() {}

	// ���ڿ� �°� ���̺� ��� �̹��� ������ �޼ҵ�
	// i�� �ܹ��� ����, n�� ������������ ���ù������� ����
	abstract public void initMaterial(int i, int n);
	// �̹��� ���� ���̺� ��ȯ
	abstract public JLabel getMaterial();
}
