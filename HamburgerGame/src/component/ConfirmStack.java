// 0일땐 랜덤햄버거 1일땐 선택햄버거
package component;

import java.util.Stack;

@SuppressWarnings("rawtypes")
public class ConfirmStack extends Stack {
	private static final long serialVersionUID = 1L;
	
	private int[] random = new int[5]; // 랜덤 햄버거 스택
	private int[] select = new int[5]; // 선택 햄버거 스택
	private int randomTop=0;
	private int selectTop=0;
	
	// 스택에 넣는 메소드
	public void push(int item, int n) {
		if(n == 0){
			random[randomTop++] = item;
		}else if(n == 1){
			select[selectTop++] = item;
		}
	}
	// 햄버거 검사하는 메소드
	public int checkHamburger(){
		for(;randomTop>0;){
			randomTop--;
			selectTop--;
			if(random[randomTop] == select[selectTop]){continue;}
			else if(random[randomTop] != select[selectTop]){
				// 틀릴경우
				return 1;
			}	
		}
		// 같을 경우
		return 0;
	}
}
