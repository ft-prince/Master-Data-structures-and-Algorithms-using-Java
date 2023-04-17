package practice_linkedlist;

public class LinkendList {

	private class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	//O(n)
    public void Display() {
    	Node temp=head;
   System.out.println("........................");
    	while(temp!=null) {
    		System.out.print(temp.data+","); 
    	temp=temp.next;
    	}
    	System.out.println();
    	System.out.println("........................");
    }
    public void AddFirst(int item) {
    	Node nn=new Node();
    	nn.data=item;
    	if(size==0) {
    		head=nn;
    		tail=nn;
    		size++;
    	}
    	else {
    		nn.next=head;
			head=nn;
			size++;
//    		head.next=nn;
//    		head=nn;
//    		size++;
    	}
    }
    //O(1)
    public int GetFirst() throws Exception {
    	if(size==0) {
    		throw new Exception("khali hai wahi");
    	}
    	return head.data;
    }
    //O(1)
    public int GetLast() throws Exception {
    	if(size==0) {
    		throw new Exception("khali hai wahi");
    	}
    	return tail.data;
    }
    //O(n)
    public int RemoveFirst() throws Exception {

    	if(size==0) {
    		throw new Exception("khali hai wahi");
    	}
    	int rv=head.data;
    	if(size==1) {
    		head=null;
    		tail=null;
    		size=0;
    	}
    	else {
    		head=head.next;
    		size--;
    	}
    return rv;
    }
    
    public int GetAtIndex(int idx) throws Exception {
    	if(size==0) {
    		throw new Exception("khali hai wahi");
    	}
    	if(idx<0||idx>=size) {
    		throw new Exception("bokhla gya  hai kya wahi");
    	}
    	Node temp=head;//aage aage bdte rhega ye dekhte rhega 
    	for (int i = 0; i <idx; i++) {
			temp=temp.next;
		}
    	return temp.data;
    }
 public int RemoveLast() throws Exception {
		if(size==0) {
    		throw new Exception("khali hai wahi");
    	} 
		int rv=tail.data;
        if(size==1) {
        	head=null;
        	tail=null;
        	size=0;
        }
        else {
        	Node sizem2=GetAtNode(size-2);
        	tail=sizem2;
        	tail.next=null;
        	size--;
        }
        return rv;
 }
 //O(N)
    private Node GetAtNode(int idx)throws Exception {
    	if(size==0) {
    		throw new Exception("khali hai wahi");
    	}
    	if(idx<0||idx>=size) {
    		throw new Exception("bokhla gya  hai kya wahi");
    	}
    	Node temp=head;//aage aage bdte rhega ye dekhte rhega 
    	for (int i = 0; i <idx; i++) {
			temp=temp.next;
		}
    	return temp;
    }
    public void AddAtIndex(int idx,int item) throws Exception {
    	if(idx<0||idx>size) {
    		throw new Exception("bokhla gya  hai kya wahi");
    	}
    if(idx==0) {
    	AddFirst(item);
    }
    else if(idx==size) {
    	AddLast(item);
    }
    else {
    	//create a nn
    	Node nn=new Node();
    	nn.data=item;
    	//ATTACH
    	Node nm1=GetAtNode(idx-1);
    	Node np1=nm1.next;
    	nm1.next=nn;//purane wali ko add kr do apni walj mein
        nn.next=np1;//apni wali ko kr do next wali mein
    size++;
    }
    }
    public void AddLast(int item) {
   Node nn=new Node();
   nn.data=item;
   if(size==0) {
	   head=nn;
		tail=nn;
     	size++; 
    	}
   
    	else {
    		// nn.val=item;
           //  tail.next=nn;
           //  tail=nn;
         //    size++;
    		tail.next=nn;
    		 tail=nn;
    		size++;
    	}
    }
}
