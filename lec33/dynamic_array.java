package lec33;

import lec32.Stacks;
public class dynamic_array extends Stacks {

public dynamic_array(int cap) {
	super(cap);
}
public void push(int item) throws Exception {
 if(this.size()==this.data.length) {
	 int []arr=new int[2*this.data.length];
	 for(int i=0;i<this.size();i++) {
		 arr[i]=this.data[i];
	 }
	 this.data=arr;
 }
 super.push(item);
}
}
