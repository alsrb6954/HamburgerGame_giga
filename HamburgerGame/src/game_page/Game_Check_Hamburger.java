package game_page;

import data_managements.ConfirmQueue;
import data_managements.ConfirmStack;

public class Game_Check_Hamburger {
	private ConfirmStack stack = new ConfirmStack();
	private ConfirmQueue queue = new ConfirmQueue();
	// ť�� �������� �ܹ��� ����� ������ ���ϴ� �޼ҵ�
	public int check() {
		for (int i = 0; i < 5; i++) {
			int s = stack.pop();
			int q = queue.dequeue();
			if (s == q) {continue;}
			else {
				stack.initialize();
				queue.initialize();
				return 1;
			}
		}
		stack.initialize();
		queue.initialize();
		return 0;
	}
	public void initialize(){
		stack.initialize();
		queue.initialize();
	}
}
