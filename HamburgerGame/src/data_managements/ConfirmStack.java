// 0�϶� �����ܹ��� 1�϶� �����ܹ���
package data_managements;

public class ConfirmStack {
	private static int[] random = new int[5]; // ���� �ܹ��� ����
	private static int randomTop = 0;

	public void initialize() {
		randomTop = 0;
	}

	// ���ÿ� �ִ� �޼ҵ�
	public void push(int item) {
		try {
			random[randomTop++] = item;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� á���ϴ�");
			System.exit(0);
		}
	}

	// �ܹ��� �񱳸� ���� �Ѱ��� ���� �޼ҵ�
	public int pop() {
		try {} 
		catch (NullPointerException e) {
			System.out.println("������ ����ֽ��ϴ�");
			System.exit(0);
		}
		return random[--randomTop];
	}
}
