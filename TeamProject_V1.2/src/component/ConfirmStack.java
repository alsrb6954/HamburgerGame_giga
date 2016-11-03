// 0�϶� �����ܹ��� 1�϶� �����ܹ���
package component;

import java.util.Stack;

@SuppressWarnings("rawtypes")
public class ConfirmStack extends Stack {
	private static final long serialVersionUID = 1L;
	
	private int[] random = new int[5]; // ���� �ܹ��� ����
	private int[] select = new int[5]; // ���� �ܹ��� ����
	private int randomTop=0;
	private int selectTop=0;
	
	// ���ÿ� �ִ� �޼ҵ�
	public void push(int item, int n) {
		if(n == 0){
			random[randomTop++] = item;
		}else if(n == 1){
			select[selectTop++] = item;
		}
	}
	// �ܹ��� �˻��ϴ� �޼ҵ�
	public int checkHamburger(){
		for(;randomTop>0;){
			randomTop--;
			selectTop--;
			if(random[randomTop] == select[selectTop]){continue;}
			else if(random[randomTop] != select[selectTop]){
				// Ʋ�����
				return 1;
			}	
		}
		// ���� ���
		return 0;
	}
}
