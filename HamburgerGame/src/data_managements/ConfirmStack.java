// 0일땐 랜덤햄버거 1일땐 선택햄버거
package data_managements;

public class ConfirmStack {
	private static int[] random = new int[5]; // 랜덤 햄버거 스택
	private static int randomTop = 0;

	public void initialize() {
		randomTop = 0;
	}

	// 스택에 넣는 메소드
	public void push(int item) {
		try {
			random[randomTop++] = item;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("스택이 꽉 찼습니다");
			System.exit(0);
		}
	}

	// 햄버거 비교를 위에 한개씩 빼는 메소드
	public int pop() {
		try {} 
		catch (NullPointerException e) {
			System.out.println("스택이 비어있습니다");
			System.exit(0);
		}
		return random[--randomTop];
	}
}
