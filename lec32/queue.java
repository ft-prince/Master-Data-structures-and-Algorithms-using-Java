package lec32;

public class queue {
      int [] data;
      int front;
      int size;
     
      public queue(){
          data=new int[5];
          front=0;
          size=0;
      }
      public queue(int cap){
          data=new int[cap];
          front=0;
          size=0;
      }
      public void enqueue(int item) throws Exception {
    	    if (isFull()){
                throw new Exception("Queue is full");
            }
    	  int idx=(front+size)%data.length;
    	  data[idx]=item;
    	  size++;
      }
      public int dequeue() throws Exception{
    	   if (isEmpty()){
               throw new Exception("Queue is empty");
           }
    	   int temp=data[front];
    	   data[front]=0;
    	   front=(front+1)%data.length ;
    	   size--;
    	   return temp;
      }
      public int getFront(){
          int temp=data[front];
          return temp;
      }
      public int size(){
          return size;
      }
      public boolean isEmpty(){
          return size==0;
      }
      public  boolean isFull(){
          return size== data.length;
      }
      public void Display(){
          System.out.println("----------------------");
          for (int i = 0; i <size ; i++) {
              int idx=(i+front)% data.length;
              System.out.print(data[idx]+" ");
          }
          System.out.println(".");
          System.out.println("----------------------");
      }
}
