package lec32;

public class Stacks {
protected  int [] data;
protected int tos;

public Stacks() {
	data=new int[5];
	tos=-1;
}
public Stacks(int item) {
	data=new int[item];
	tos=-1;
}
public void push(int item)throws  Exception {
	if(isFull()) {
		 throw  new Exception("stack is full");
	}
	tos++;
	data[tos]=item;
}
public int pop()  throws  Exception{
	if(isEmpty()) {
        throw new Exception(" stack is empty");

	}
	int temp=data[tos];
	data[tos]=0;
	tos--;
return temp;
}
public int peek() {
	int temp=data[tos];
return temp;
}
public int size(){
    return  tos+1;
}
public boolean isEmpty(){
    // return tos==-1
    return size()==0;
}
public boolean isFull(){
return size()== data.length;
}
public void display(){
System.out.println("------------------");
for (int i = tos; i >=0 ; i--) {
    System.out.print(data[i]+" ");
}
System.out.println(".");
System.out.println("------------------");
}

}
