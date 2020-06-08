
public class SinglyLinkedList {

	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data = data;
		}
	}
	
	Node head;
	
	public boolean add(Object data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return true;
		}
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		
		n.next = node;
		
		return true;
	}
	
	
	public boolean addFirst(Object data){
		Node node = new Node(data);
		node.next = head;
		head = node;
		return true;
	}
	
	public boolean addAt(int index, Object data){
		Node node = new Node(data);
		if(index == 0){
			addFirst(data);
			return true;
		}
		Node n = head;
		for (int i = 0; i < index-1; i++) {
			n = n.next;
			if(n==null){
				System.out.println("Index out of bounds........");
				return false;
			}
		}
		if(n.next == null ){
			add(data);
			return true;
		}
		node.next = n.next;
		n.next = node;
		return true;
	}
	
	public Object deleteFirst(){
		if(head == null)
			throw new NullPointerException("List is empty...");
		
		Object data = head.data;
		head = head.next;
		return data;
	}
	
	public Object deleteLast(){
		if(head == null)
			throw new NullPointerException("List is empty...");
		
		Node n = head, p = head;
		while(n.next!=null){
			p = n;
			n = n.next;
		}
		Object data = n.data;
		if(p.next!=null)
			p.next = null;
		else
			head = null;
		return data;
	}
	
	public Object deleteAt(int index){
		if(head == null)
			throw new NullPointerException("List is empty...");
		if(index == 0){
			Object data = head.data;
			head = head.next;
			return data;
		}
		Node n = head;
		Node temp = null;
		for(int i=0 ; i<index-1; i++){
			n = n.next;
			if(n.next==null){
				System.out.println("Index out of bounds........");
				return false;
			}
		}
		temp = n.next;
		Object data = temp.data;
		n.next = temp.next;
		return data;
		
	}
	
	public void reverse(){
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;	
	}
	
	public String toString(){
		String st ="[";
		Node n = head;
		 while(n != null){
			 st = st+n.data;
			 if(n.next != null)
				 st = st+" ";
			 n = n.next;
		 }
		 return st+"]";
	}
}
