package Lec13;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
		for(int i = 1; i <= 5;i++)
		{
			ll.addLast(i);
		}
		ll.display();
		System.out.println();
		System.out.println(ll.size());

	}

}
