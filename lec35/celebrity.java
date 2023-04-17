package lec35;

import java.util.Iterator;
import java.util.Stack;

public class celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println( checkwho(4));
}
	public static int  checkwho(int n) {
		Stack<Integer>st=new Stack<>();
         for (int i = 0; i < n; i++) {
	  st.push(i);
     }
         while(st.size()>1) {
        	 int a=st.pop();
        	 int b=st.pop();
        	 if(knows(a,b)==true) {
        		 st.push(b);
        	 }
        	 else {
        		 st.push(a);
        	 }
         }
         int candidate=st.pop();
        for (int i = 0; i < n; i++) {
			if(i!=candidate&&(knows(i,candidate)==false)||knows(candidate,i)==true) {
				return -1;
			}
		}
		return candidate;
	}
	private static boolean knows(int a, int b) {
		// TODO Auto-generated method stub
	      int matrix[][]={ {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
	   if( matrix[a][b]==1) {
		   return true;
	   }
	      
		return false;
	}

}
