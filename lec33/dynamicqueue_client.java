package lec33;

public class dynamicqueue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamicQueue dq=new dynamicQueue();
	dq.enqueue(10);
	dq.enqueue(20);
	dq.enqueue(30);
	dq.enqueue(40);
	dq.enqueue(50);
	dq.Display();
    dq.dequeue();
    dq.enqueue(60);
    dq.Display();
   
	}

}
