package game_page;

import data_managements.ConfirmQueue;
import data_managements.ConfirmStack;

public class Game_Check_Hamburger {
	private ConfirmStack stack = new ConfirmStack();
	private ConfirmQueue queue = new ConfirmQueue();
	// 큐와 스택으로 햄버거 모양이 같은지 비교하는 메소드
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
