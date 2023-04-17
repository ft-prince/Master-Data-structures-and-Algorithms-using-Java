package lec35;
import java.util.*;
public class Smallest_number {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String ans=NUmberfromD("IIIDIDDD");
    System.out.println(ans);
	}
 public static String NUmberfromD(String s) {
	Stack<Integer>st=new Stack<>();
    int ans[]=new int [s.length()+1];
    int count=1;
    for (int i = 0; i < ans.length; i++) {
		if(i==s.length()||s.charAt(i)=='I') {
			ans[i]=count;
			count++;
			while(!st.isEmpty()) {
				ans[st.pop()]=count;
				count++;
			}
		}
		else {
			st.push(i);
		}
	}
    String str="";
    for (int i = 0; i < ans.length; i++) {
		str+=ans[i];
	}
    return str;
 }
}
