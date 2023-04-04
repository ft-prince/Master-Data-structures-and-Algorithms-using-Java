package lec32;

public class stacks_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	     Stacks s=new Stacks(4);
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.push(40);
	        s.display();
	        //    s.data=new int[5];
//	        it'll destroy the data
	        //isliye private kr do public ki jgh to koi access nhi kr payega thik hai

	        //s.push(50);
	        System.out.println(s.pop());
	        s.display();
	        System.out.println(s.peek());
	        s.display();


	}

}
