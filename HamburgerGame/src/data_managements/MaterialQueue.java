package data_managements;

public class MaterialQueue {
	int arraySize;
	private int front = 0, rear = 0;
	private int[] arr;
	public MaterialQueue(int arraySize){
    	this.arraySize = arraySize;
    	arr = new int[this.arraySize];
	}
    // 원형 큐를 넣어주는 곳
    public void enqueue(int data){
    	try{
	        if((rear + 1) % arraySize ==  front % arraySize) {
	            System.out.println("CircularQueue Full!!");
	        } else {
	            rear = (rear + 1) % arraySize;
	            arr[rear] = data;
	        }
    	}catch(ArrayIndexOutOfBoundsException e){
    		System.out.println("원형큐가 꽉 찼습니다");
			System.exit(0);
    	}
    }
    // 원형큐를 빼주는 곳
    public int dequeue(){
    	try{
	        if(front == rear){
	            System.out.println("CircularQueue Empty!!");
	            return 0;
	        } else{
	            front = (front + 1) % arraySize;
	        }
    	}catch(NullPointerException e){
    		System.out.println("원형큐가 비어있습니다");
			System.exit(0);
    	}
        return arr[front];
    }

}
