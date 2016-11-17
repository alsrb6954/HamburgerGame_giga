package hamburger;

import javax.swing.JLabel;

import data_managements.ConfirmStack;

public abstract class Material {
	private ConfirmStack stack = new ConfirmStack();
	public Material() {}

	// ���ڿ� �°� ���̺� ��� �̹��� ������ �޼ҵ�
	// i�� �ܹ��� ����
	abstract public void initMaterial(int i);
	// �̹��� ���� ���̺� ��ȯ
	abstract public JLabel getMaterial();
	public void stackPush(int i){ stack.push(i); }
}
