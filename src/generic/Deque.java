package generic;

public class Deque<T> {
	class Node{
		T data;
		Node next;
		Node previous;
		Node(T data){
			this.data = data;
		}
	}
	
	Node front;
	Node rear;
	
	public void addRear(T item){
		Node node = new Node(item);
		if(front == null && rear == null){
			front = node;
			rear = node;
		}
		else{
			rear.next = node;
			node.previous = rear;
			rear = node;
		}
	}
	
	public void addFront(T item){
		Node node = new Node(item);
		if(front == null && rear == null){
			front = node;
			rear = node;
		}
		else{
			node.next = front;
			front.previous = node;
			front = node;
		}
	}
	
	public T removeRear(){
		Node n = rear;
		if(rear == front){
			T data = rear.data;
			rear = rear.next;
			front = front.next;
			return data;
		}
		
		T data = n.data;
		rear = n.previous;
		n.previous.next = n.next;
		return data;
	}
	
	public T removeFront(){
		Node n = front;
		if(front == rear){
			T data = front.data;
			front = front.next;
			rear = rear.next;
			return data;
		}
		
		T data = n.data;
		front = n.next;
		n.next.previous = n.previous;
		return data;
	}
	
	public int size(){
		int i = 0;
		Node n = front;
		while(n != null){
			i++;
			n = n.next;
		}
		return i;
	}
	
	public boolean isEmpty(){
		if(front == null && rear == null)
			return true;
		return false;
	}
	
	public String toString(){
		String s = "[";
		Node n = front;
		while(n != null){
			s = s+n.data;
			if(n.next != null)
				s = s+" "; 
			n = n.next;
		}
		return s+"]";
	}
}
