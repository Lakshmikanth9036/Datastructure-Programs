package Queue;

public class Runner {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(8);
		System.out.println(queue);
		queue.enque(10);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		System.out.println(queue);
		System.out.println(queue.deque());
		System.out.println(queue.deque());
		System.out.println(queue.size());
	}

}
