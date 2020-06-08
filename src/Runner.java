
public class Runner {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add("rama");
		list.add("shama");
		list.add("bhama");
		list.add(420);
		System.out.println(list);
//		list.addFirst(0);
//		System.out.println(list);
//		System.out.println(list.deleteFirst());
//		System.out.println(list);
//		System.out.println(list.deleteLast());
//		System.out.println(list);
		list.addAt(4, 40);
		System.out.println(list);
		System.out.println(list.deleteAt(5));
		System.out.println(list);
		
	}

}
