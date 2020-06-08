package DoublyLinkedList;

public class CircularDoublyLinkedList {

		class Node{
			Object data;
			Node next;
			Node previous;
			Node(Object data){
				this.data = data;
			}
		}
		
		Node head;
		Node tail;
		
		boolean add(Object data){
			Node node = new Node(data);
			if(head == null){
				head = node;
				tail = node;
				node.next = head;
				node.previous = tail;
				return true;
			}
			
			Node n = head;
			while(n.next != tail.next){
				n = n.next;
			}
			n.next = node;
			node.previous = n;
			node.next = head;
			tail = node;
			return true;
		}
		
		boolean addFirst(Object data){
			Node node = new Node(data);
			node.next = head;
			tail.next = node;
			head = node;
			head.previous = tail;
			return true;
		}
		
		boolean addAt(int index, Object data){
			Node node = new Node(data);
			if(index == 0){
				return addFirst(data);
			}
			Node n = head;
			for (int i = 0; i < index-1; i++) {
				n = n.next;
			}
			if(n.next == tail.next){
				return add(data);
			}
			node.next = n.next;
			node.previous = n.next.previous;
			n.next.previous = node;
			n.next = node;
			return true;
		}
		
		
		Object deleteFirst(){
			if(head == null)
				throw new NullPointerException("List is empty.....");
			Object data = head.data;
			head = head.next;
			head.previous = tail;
			tail.next = head;
			return data;
		}
		
		Object deleteLast(){
			if(head == null)
				throw new NullPointerException("List is empty.....");
			Object data = tail.data;
			tail = tail.previous;
			tail.next = head;
			return data;
		}
		
		Object deleteAt(int index){
			if(head == null)
				throw new NullPointerException("List is empty.....");
			
			Node n = head;
			for(int i = 0 ; i < index ; i++){
				n = n.next;
			}
			Object data = n.data;
			n.previous.next = n.next;
			n.next.previous = n.previous;
			return data;
		}
		
		public String toString(){
			String st = "[";
			Node n = head;
			while(n.next != tail.next){
				st = st+n.data;
				st = st+" ";
				n = n.next;
			}
			return st+n.data+"]";
		}
}
