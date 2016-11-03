package data_managements;

public class MaterialQueue {
	final int ArraySize = 6;
	private int front = 0, rear = 0;
	private int[] arr = new int[ArraySize];
    
    public void enqueue(int data){
    	try{
	        if((rear + 1) % ArraySize ==  front % ArraySize) {
	            System.out.println("CircularQueue Full!!");
	        } else {
	            rear = (rear + 1) % ArraySize;
	            arr[rear] = data;
	        }
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("원형큐가 꽉 찼습니다");
			System.exit(0);
    	}
    }
    
    public int dequeue(){
    	try{
	        if(front == rear){
	            System.out.println("CircularQueue Empty!!");
	            return 0;
	        } else{
	            front = (front + 1) % ArraySize;
	        }
    	}catch(NullPointerException e){
    		System.out.println("원형큐가 비어있습니다");
			System.exit(0);
    	}
        return arr[front];
    }

}
