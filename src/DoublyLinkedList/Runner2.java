package DoublyLinkedList;

public class Runner2 {

	public static void main(String[] args) {
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.addFirst(5);
		System.out.println(list);
		System.out.println(list.deleteFirst());
		System.out.println(list);
		System.out.println(list.deleteLast());
		System.out.println(list);
		list.addAt(1, 5);
		System.out.println(list);
		list.addAt(4, 40);
		System.out.println(list);
		System.out.println(list.deleteAt(1));
		System.out.println(list);
		
	}

}
