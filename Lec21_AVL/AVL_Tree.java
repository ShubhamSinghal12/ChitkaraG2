package Lec21_AVL;

public class AVL_Tree {
	
	private class Node{
		int data ,ht;
		Node left,right;
		Node(int data)
		{
			this.data = data;
			ht = 1;
			left = right = null;
		}
	}
	private Node root;
	
	private int height(Node r)
	{
		return r == null ? 0 : r.ht;
	}
	private int balancingFactor(Node r)
	{
		return r == null ? 0 :height(r.left)-height(r.right);
	}
	
	private Node rightRotate(Node x)
	{
		Node y = x.left;
		Node T2 = y.right;
		
		y.right = x;
		x.left = T2;
		
		x.ht = Math.max(height(x.left),height(x.right))+1;
		y.ht = Math.max(height(y.left),height(y.right))+1;
		
		return y;
	}
	private Node leftRotate(Node y)
	{
		Node x = y.right;
		Node T2 = x.left;
		
		y.right = T2;
		x.left = y;
		
		y.ht = Math.max(height(y.left),height(y.right))+1;
		x.ht = Math.max(height(x.left),height(x.right))+1;
		
		return x;
	}
	
	public void insert(int ele)
	{
		this.root = insert(root,ele);
	}
	private Node insert(Node r,int ele)
	{
		if(r == null)
		{
			return new Node(ele);
		}
		else
		{
			if(r.data > ele)
			{
				r.left = insert(r.left,ele);
			}
			else
			{
				r.right = insert(r.right,ele);
			}
			
			r.ht = Math.max(height(r.left), height(r.right)) + 1;
			int bf = balancingFactor(r);
			
			if(bf > 1 && ele < r.left.data)
			{
				return rightRotate(r);
			}
			else if(bf > 1 && ele > r.left.data)
			{
				r.left = leftRotate(r.left);
				return rightRotate(r);
			}
			else if(bf < -1 && ele > r.right.data)
			{
				return leftRotate(r);
			}
			else if(bf < -1 && ele < r.right.data)
			{
				r.right = rightRotate(r.right);
				return leftRotate(r);
			}
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
	
	private int min(Node r)
	{
		if(r.left == null)
			return r.data;
		else
			return min(r.left);
	}
	
	public void delete(int ele)
	{
		this.root = delete(root, ele);
	}
	private Node delete(Node r,int ele)
	{
		if(r == null)
			return null;
		else if(r.data > ele)
			r.left = delete(r.left, ele);
		else if (r.data < ele)
			r.right = delete(r.right, ele);
		else
		{
			if(r.left == null && r.right == null)
				return null;
			else if (r.right == null)
				return r.left;
			else if (r.left == null)
				return r.right;
			else
			{
				int m = min(r.right);
				r.data = m;
				r.right = delete(r.right,m);
			}
		}
		r.ht = Math.max(height(r.left), height(r.right)) + 1;
		int bf = balancingFactor(r);
		
		if(bf > 1 && balancingFactor(r.left) >= 0)
		{
			return rightRotate(r);
		}
		else if(bf > 1 && balancingFactor(r.left) < 0)
		{
			r.left = leftRotate(r.left);
			return rightRotate(r);
		}
		else if(bf < -1 && balancingFactor(r.right) <= 0)
		{
			return leftRotate(r);
		}
		else if(bf < -1 && balancingFactor(r.right) > 0)
		{
			r.right = rightRotate(r.right);
			return leftRotate(r);
		}
		
		return r;
	}
	
	

}
