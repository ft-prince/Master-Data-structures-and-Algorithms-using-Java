package lec32;

public class queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  queue queue=new queue();
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);
	        System.out.println(queue.dequeue());
	        System.out.println(queue.dequeue());
	        queue.Display();
	        queue.enqueue(60);
	        queue.enqueue(70);
	        queue.Display();
	}

}
