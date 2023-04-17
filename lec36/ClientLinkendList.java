package practice_linkedlist;

public class ClientLinkendList {

	public static void main(String[] args) throws Exception {
	 // TODO Auto-generated method stub
	LinkendList ll=new LinkendList();
	ll.AddLast(10);
	ll.AddLast(20);
	ll.AddLast(30);
	ll.AddLast(40);
	ll.AddLast(50);
   ll.Display();
	LinkendList list=new LinkendList();
     list.AddFirst(10);
     list.AddFirst(20);
     list.AddFirst(30);
     list.AddFirst(40);
     list.AddFirst(50);
	 list.Display();
     System.out.println(list.GetFirst());
     System.out.println(	list.GetLast());
     System.out.println(ll.GetAtIndex(4));
	list.Display();
	list.AddAtIndex(2, -20);
	list.Display();
	list.RemoveFirst();
   list.Display();
   LinkendList El=new LinkendList();
	El.AddFirst(10);
	El.AddFirst(20);
	El.Display();
System.out.println(	El.RemoveFirst());
   El.Display();
   
list.Display();
   System.out.println(   list.RemoveLast());
   list.Display();
//	El.RemoveFirst();
	}
}
