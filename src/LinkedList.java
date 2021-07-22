
public class LinkedList  {
	Node head;

	public void add(Object data){
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head==null){
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = node;
		}
	}

	public void addFirst(Object data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;	
	}

	public void addAt(int index, Object data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index==0){
			addFirst(data);
		}
		else{
			Node n = head;
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index){
		if(index == 0){
			head = head.next;
		}
		else{
			Node n = head;
			Node n1 = null;
			for(int i=0; i<index-1; i++){
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void show(){
		Node n = head;
		while(n.next != null){
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}


}
