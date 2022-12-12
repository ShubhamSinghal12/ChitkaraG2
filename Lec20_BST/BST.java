package Lec20_BST;

public class BST {
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node()
		{
			this(0);
		}
		Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}
	private Node root;
	
	
	public void createTree(int[] arr)
	{
		this.root = createTree(arr, 0, arr.length-1);
	}
	private Node createTree(int[] arr,int si,int ei)
	{
		if(si > ei)
		{
			return null;
		}
		else
		{
			int mid = (si+ei)/2;
			Node r = new Node(arr[mid]);
			r.left = createTree(arr, si, mid-1);
			r.right = createTree(arr, mid+1,ei);
			return r;
		}
	}
	
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			String st = "";
			if(r.left!=null)
			{
				st += r.left.data;
			}
			st += " -> "+ r.data + " <- ";
			if(r.right!=null)
			{
				st += r.right.data;
			}
			System.out.println(st);
			display(r.left);
			display(r.right);	
		}
	}
	
	public boolean find(int ele)
	{
		return this.find(this.root,ele);
	}
	private boolean find(Node r,int ele)
	{
		if(r == null)
		{
			return false;
		}
		else
		{
			if(r.data == ele)
			{
				return true;
			}
			else if(r.data > ele)
				return find(r.left,ele);
			else
				return find(r.right,ele);
		}
	}
	
	public int size()
	{
		return this.size(this.root);
	}
	private int size(Node r)
	{
		if(r == null)
		{
			return 0;
		}
		else
		{
			return 1+size(r.left)+size(r.right);
		}
	}
	
	public int min()
	{
//		return min(root);
		Node r = root;
		while(r.left != null)
			r = r.left;
		return r.data;
	}
	private int min(Node r)
	{
		if(r.left == null)
			return r.data;
		else
			return min(r.left);
	}
	public void add(int ele)
	{
		if(root == null)
		{
			this.root = new Node(ele);
			return;
		}
		add(root,ele);
	}
	private void add(Node r,int ele)
	{
		if(r.data < ele)
		{
			if(r.right == null)
				r.right = new Node(ele);
			else
				add(r.right,ele);
		}
		else
		{
			if(r.left == null)
				r.left = new Node(ele);
			else
				add(r.left,ele);
		}
	}
	
	
	public void add2(int ele)
	{
		this.root = add2(root,ele);
	}
	private Node add2(Node r,int ele)
	{
		if(r == null)
		{
			return new Node(ele);
		}
		else
		{
			if(r.data > ele)
			{
				r.left = add2(r.left,ele);
			}
			else
			{
				r.right = add2(r.right,ele);
			}
			return r;
		}
	}
	
	public void inorder()
	{
		this.inorder(root);
	}
	
	private void inorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			inorder(r.right);
			System.out.print(r.data+" ");
			inorder(r.left);
		}
	}
	
	public void delete(int ele)
	{
		this.root = delete(root,ele);
	}
	public Node delete(Node r,int ele)
	{
		if(r == null)
		{
			return null;
		}
		else if(r.data < ele)
		{
			r.right = delete(r.right,ele);
		}
		else if(r.data > ele)
		{
			r.left = delete(r.left,ele);
		}
		else
		{
			if(r.left == null &&r.right == null)
			{
				return null;
			}
			else if(r.left == null)
			{
				return r.right;
			}
			else if(r.right == null)
			{
				return r.left;
			}
			else
			{
				int d = min(r.right);
				r.data = d;
				delete(r.right,d);
			}
		}
		return r;
	}
}
