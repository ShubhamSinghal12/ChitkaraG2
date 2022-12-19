package Lec24;

public class MyLinkedList <T extends Comparable<T>>{
	
	private class Node {
		
		T data;
		Node next;
		
		Node()
		{
			this(null,null);
		}
		Node(T data)
		{
			this(data,null);
		}
		Node(T data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	private Node head;
	
	public void addFirst(T ele)
	{
		Node temp = new Node(ele,this.head);
		head = temp;
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
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
	
	public void addLast(T ele)
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
	public T getFirst()
	{
		return head.data;
	}
	public T getAt(int idx)
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
	
	public void addAt(T ele,int idx)
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
	
	public T getLast()
	{
		return getAt(size()-1);
	}
	
	public T removeFirst()
	{
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	public T removeLast()
	{
		if(size() == 1)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(size()-2);
		T x = temp.next.data;
		temp.next = null;
		return x;
	}
	
	public T removeAt(int idx)
	{
		if(idx == 0)
		{
			return removeFirst();
		}
		Node temp = getNodeAt(idx-1);
		T x = temp.next.data;
		temp.next = temp.next.next;
		return x;
	}
	public void set(int idx,T ele)
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
				if(j.data.compareTo(j.next.data) > 0)
				{
					T t = j.data;
					j.data = j.next.data;
					j.next.data = t;
				}
				j = j.next;
			}
			temp = temp.next;
		}
	}
	
	public T midV()
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
	
}
