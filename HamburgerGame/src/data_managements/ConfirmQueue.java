package data_managements;

public class ConfirmQueue {
	private static int[] select = new int[5]; // ���� �ܹ��� ����
	private static int selectFront = 0;
	private static int selectRear = 0;
	
	// �ʱ�ȭ �����ִ� �޼ҵ�
		public void initialize(){
			selectFront=0;
			selectRear=0;
		}
	// ť�� �ִ� �޼ҵ�
	public void enqueue(int item){
		try{
			select[selectFront++] = item;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ť�� �� á���ϴ�");
			System.exit(0);
		}
	}
	// �ܹ��� �񱳸� ���� �Ѱ��� ���� �޼ҵ�
	public int dequeue(){
		try{}
		catch(NullPointerException e){
			System.out.println("ť�� ����ֽ��ϴ�");
			System.exit(0);
		}
		return select[selectRear++];
	}
	
}
