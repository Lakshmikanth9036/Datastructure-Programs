package Queue;

public class MyQueue {
	private Object[] obj;
	int capacity,front,rear;
	
	public MyQueue(int capacity){
		this.capacity = capacity;
		front = rear = -1;
		obj = new Object[capacity];
	}
	
	public boolean enque(Object ele){
		if(rear == capacity-1){
			System.out.println("Queue is full...");
			return false;
		}
		if(rear == -1)
			front++;
		obj[++rear] = ele;
		return true;
	}
	
	public Object deque(){
		if(front == -1){
			System.out.println("Queue is empty");
			return null;
		}
		
		Object ob = obj[front++];
		if(front>rear)
			front = rear = -1;
		return ob;
	}
	
	public String toString(){
		String st="[";
		for(int i=front; i<=rear&&front!=-1; i++){
			st = st+obj[i];
			if(front<rear)
				st = st+",";
		}
		return st+"]";
	}
	
	public int size(){
		if(front == -1)
			return 0;
		return rear-front+1;
	}
	
	
	

}
