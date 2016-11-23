package data_managements;

public class MaterialQueue {
	int arraySize;
	private int front = 0, rear = 0;
	private int[] arr;
	public MaterialQueue(int arraySize){
    	this.arraySize = arraySize;
    	arr = new int[this.arraySize];
	}
    // ���� ť�� �־��ִ� ��
    public void enqueue(int data){
    	try{
	        if((rear + 1) % arraySize ==  front % arraySize) {
	            System.out.println("CircularQueue Full!!");
	        } else {
	            rear = (rear + 1) % arraySize;
	            arr[rear] = data;
	        }
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("����ť�� �� á���ϴ�");
			System.exit(0);
    	}
    }
    // ����ť�� ���ִ� ��
    public int dequeue(){
    	try{
	        if(front == rear){
	            System.out.println("CircularQueue Empty!!");
	            return 0;
	        } else{
	            front = (front + 1) % arraySize;
	        }
    	}catch(NullPointerException e){
    		System.out.println("����ť�� ����ֽ��ϴ�");
			System.exit(0);
    	}
        return arr[front];
    }

}
