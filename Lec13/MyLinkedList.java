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
	
	
}
