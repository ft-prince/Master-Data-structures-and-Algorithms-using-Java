package lec33;
 
import lec32.queue;
public class dynamicQueue extends queue {

	@Override
	public void enqueue(int item) throws Exception {
		if(super.isFull()) {
			int arr[]=new int[2*this.data.length];
		
		for(int i=0;i<this.data.length;i++) {
			int idx=(this.front+i)%this.data.length;
			arr[i]=data[i];
       }
     	this.data=arr;
		this.front=0;
	}
		super.enqueue(item);
	}
}