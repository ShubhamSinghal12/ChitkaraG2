package Lec13;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyLinkedList ll = new MyLinkedList();
//		for(int i = 1; i <= 7;i++)
//		{
//			ll.addLast(i);
//		}
//		ll.display();
//		System.out.println(ll.midV());
//		System.out.println(ll.size());
//		ll.reverseR();
//		ll.bubble_sort();
//		ll.display();
		
//		MyLinkedList a = new MyLinkedList();
//		a.addLast(1);
////		a.addLast(3);
////		a.addLast(4);
////		a.addLast(7);
////		a.addLast(9);
//		MyLinkedList b = new MyLinkedList();
//		b.addLast(2);
////		b.addLast(5);
////		b.addLast(6);
////		b.addLast(8);
////		b.addLast(10);
////		b.addLast(11);
//		a.display();
//		b.display();
//		System.out.println("---------------------------");
//		MyLinkedList ans = a.merge2(a, b);
//		ans.display();
//		a.display();
//		b.display();
		
		MyLinkedList ll = new MyLinkedList();
		ll.addFirst(3);
		ll.addFirst(6);
		ll.addFirst(4);
		ll.addFirst(1);
		ll.addFirst(7);
		ll.addFirst(9);
		ll.display();
		ll.mergeSort();
		ll.display();
	}

}
