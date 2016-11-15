package data_managements;

public class ConfirmQueue {
	private static int[] select = new int[5]; // 선택 햄버거 스택
	private static int selectFront = 0;
	private static int selectRear = 0;
	
	// 초기화 시켜주는 메소드
		public void initialize(){
			selectFront=0;
			selectRear=0;
		}
	// 큐에 넣는 메소드
	public void enqueue(int item){
		try{
			select[selectFront++] = item;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("큐가 꽉 찼습니다");
			System.exit(0);
		}
	}
	// 햄버거 비교를 위에 한개씩 빼는 메소드
	public int dequeue(){
		try{}
		catch(NullPointerException e){
			System.out.println("큐가 비어있습니다");
			System.exit(0);
		}
		return select[selectRear++];
	}
	
}
