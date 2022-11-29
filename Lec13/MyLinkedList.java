package Lec13;

public class MyLinkedList {
	
	
	private class Node {
		
		int data;
		Node next;
		
		Node()
		{
			this(0,null);
		}
		Node(int data)
		{
			this(data,null);
		}
		Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	private Node head;
	
	public void addFirst(int ele)
	{
		Node temp = new Node(ele,this.head);
		head = temp;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public int size()
	{
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
//			System.out.print(temp.data+" ");
			count++;
			temp = temp.next;
		}
		return count;
	}
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public void addLast(int ele)
	{
		if(isEmpty())
		{
			addFirst(ele);
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = new Node(ele);
		
	}
	public int getFirst()
	{
		return head.data;
	}
	public int getAt(int idx)
	{
		if(idx < 0 || idx >= size())
		{
			return -1;
		}
		int id = 0;
		Node temp = this.head;
		while(id != idx)
		{
			temp = temp.next;
			id++;
		}
		return temp.data;
		
	}
	
	private Node getNodeAt(int idx)
	{
		if(idx < 0 || idx >= size())
		{
			return null;
		}
		int id = 0;
		Node temp = this.head;
		while(id != idx)
		{
			temp = temp.next;
			id++;
		}
		return temp;
		
	}
	
	public void addAt(int ele,int idx)
	{
		if(idx == 0)
		{
			addFirst(ele);
			return;
		}
		Node temp = getNodeAt(idx-1);
		Node nn = new Node(ele,temp.next);
		temp.next = nn;
	}
	
	public int getLast()
	{
		return getAt(size()-1);
	}
	
	public int removeFirst()
	{
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	public int removeLast()
	{
		if(size() == 1)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(size()-2);
		int x = temp.next.data;
		temp.next = null;
		return x;
	}
	
	public int removeAt(int idx)
	{
		if(idx == 0)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(idx-1);
		int x = temp.next.data;
		temp.next = temp.next.next;
		return x;
	}
	public void set(int idx,int ele)
	{
		Node temp = getNodeAt(idx);
		temp.data = ele;
	}
	
	public void reverse()
	{
		Node prev = null;
		Node cur = this.head;
		while(cur != null)
		{
			Node ahead = cur.next;
			cur.next = prev;
			
			prev = cur;
			cur = ahead;
		}
		this.head = prev;
	}
	private void revR(Node prev,Node cur)
	{
		if(cur == null)
		{
			this.head = prev;
			return;
		}
		else
		{
			revR(cur,cur.next);
			cur.next = prev;
		}
	}
	private void revOR(Node prev)
	{
		if(prev.next == null)
		{
			this.head = prev;
			return;
		}
		else
		{
			revOR(prev.next);
			prev.next.next = prev;
		}
	}
	public void reverseR()
	{
		Node temp = this.head;
		this.revOR(this.head);
		temp.next = null;
	}
	public void bubble_sort()
	{
		Node temp = this.head;
		while(temp.next != null)
		{
			Node j = this.head;
			while(j.next != null)
			{
				if(j.data > j.next.data)
				{
					int t = j.data;
					j.data = j.next.data;
					j.next.data = t;
				}
				j = j.next;
			}
			temp = temp.next;
		}
	}
	
	public int midV()
	{
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
		
	}
	private Node midN()
	{
		Node slow = this.head;
		Node fast = this.head;
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	
	public static MyLinkedList merge(MyLinkedList a, MyLinkedList b)
	{
		MyLinkedList ans = new MyLinkedList();
		Node i = a.head;
		Node j = b.head;
		while(i!=null && j!= null)
		{
			if(i.data < j.data)
			{
				ans.addLast(i.data);
				i = i.next;
			}
			else
			{
				ans.addLast(j.data);
				j = j.next;
			}
		}
		while(i!=null)
		{
			ans.addLast(i.data);
			i = i.next;
		}
		while(j!=null)
		{
			ans.addLast(j.data);
			j = j.next;
		}
		return ans;
	}
	
	public MyLinkedList merge2(MyLinkedList a, MyLinkedList b)
	{
		MyLinkedList ans = new MyLinkedList();
		Node h = new Node(0);
		Node i = a.head;
		Node j = b.head;
//		if(i.data < j.data)
//		{
//			h = i;
//			i = i.next;
//		}
//		else
//		{
//			h = j;
//			j = j.next;
//		}
		Node t = h;
		while(i!=null && j!= null)
		{
			if(i.data < j.data)
			{
				h.next = i;
				i = i.next;
				h = h.next;
			}
			else
			{
				h.next = j;
				j = j.next;
				h = h.next;
			}
		}
		while(i!=null)
		{
			h.next = i;
			i = i.next;
			h = h.next;
		}
		while(j!=null)
		{
			h.next = j;
			j = j.next;
			h = h.next;
		}
		ans.head = t.next;
		return ans;
	}
	public void mergeSort()
	{
		MyLinkedList ans = this.mergeHelper();
		this.head = ans.head;
	}
	private MyLinkedList mergeHelper()
	{
		if(this.size() <= 1)
		{
			MyLinkedList ll = new MyLinkedList();
			ll.head = this.head;
			return ll;
		}
		else
		{
			Node mid = this.midN();
			MyLinkedList a = new MyLinkedList();
			MyLinkedList b = new MyLinkedList();
			a.head = this.head;
			b.head = mid.next;
			mid.next = null;
			MyLinkedList sa = a.mergeHelper();
			MyLinkedList sb = b.mergeHelper();
			return merge(sa, sb);
		}
	}
	public void dummyList()
	{
//		MyLinkedList ll = new MyLinkedList();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;
		
		this.head = n1;
//		System.out.println();
//		this.display();
		detectandremoveCycle();
		this.display();
	}
	public void detectandremoveCycle()
	{
		Node slow = this.head;
		Node fast = this.head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				break;
			}
		}
		
		Node i = this.head;
		while(i.next != slow.next)
		{
			i = i.next;
			slow = slow.next;
		}
		slow.next = null;
	}
	
}
