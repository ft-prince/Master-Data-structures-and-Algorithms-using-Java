package lec34;

import java.util.*;

public class Reverse_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []arr= {50,40,30,20,10};
      
	Stack<Integer>st=new Stack<>();
	st.push(50);
	st.push(40);
	st.push(30);
	st.push(20);
	st.push(10);
	System.out.println(st.peek());
	System.out.println(st);
	reverse(st);
	System.out.println("**********************");
	System.out.println(st);
	}
  public static void reverse(Stack<Integer>st) {
	if(st.isEmpty()) {
		return;
 } 
	int x=st.pop();
	reverse(st);
	Insert_down(st,x);
}
private static void Insert_down(Stack<Integer> st, int x) {
	// TODO Auto-generated method stub
	if(st.isEmpty()) {
		st.push(x);
		return;
	}
	int y=st.pop();
   Insert_down(st,x);
   st.push(y);
}
}
