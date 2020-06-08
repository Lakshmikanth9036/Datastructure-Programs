package DoublyLinkedList;

public class Runner {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
//		list.addFirst(0);
//		System.out.println(list);
//		list.deleteFirst();
//		System.out.println(list);
//		list.deleteLast();
//		System.out.println(list);
//		list.reverse();
//		System.out.println(list);
		list.addAt(4, 25);
		System.out.println(list);
		System.out.println(list.deleteAt(4));
		System.out.println(list);
//		list.reverse();
//		System.out.println(list);
	}

}
