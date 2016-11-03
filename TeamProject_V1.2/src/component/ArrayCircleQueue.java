package component;


public class ArrayCircleQueue implements CircleQueueInterface
{
	private int front; 
	private int rear; 
	private int queueSize; 
	private int itemArray[];
	
	// ������ �޼ҵ�
	public ArrayCircleQueue(int queueSize){ 
	    front = 0; 
	    rear = 0; 
	    this.queueSize = queueSize; 
	    itemArray = new int[queueSize]; 
	}

	@Override
	public boolean isEmpty() {
		return false;
	}
	
	public boolean isFull(){ 
	    return (((rear + 1) % (queueSize)) == front); 
	}

	@Override
	public void enQueue(int item) {
		if(isFull())
		{ 
		    System.out.println("������������"); 
	    }else
	    {
		    rear = (rear + 1) % (queueSize); 
		    itemArray[rear] = item;  
		}
	}
	
	@Override
	public int deQueue() {
		if(isEmpty())
		{ 
	        System.out.println("�ƹ��͵� ���ٳ� Ű��"); 
	        return 0; 
	    }
		else
		{ 
	        front = (front + 1) % queueSize; 
	        return itemArray[front]; 
	    } 
	}
//	@Override
//	public void delete(){
//		if(isEmpty())
//		{ 
//	        System.out.println("�ƹ��͵� ���µ�??"); 
//	    }
//		else
//		{ 
//	        front = (front + 1) % queueSize; 
//	    }
//	}
//
//	@Override
//	public char peek() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void printQueue() {
//		// TODO Auto-generated method stub
//		
//	}
}