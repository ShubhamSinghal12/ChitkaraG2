package Lec17_Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
	
	Scanner sc = new Scanner(System.in);
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
	
	public void createTree2()
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		this.root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n7;
		n5.right = n8;
		n3.right = n6;
		
	}
	public void createTree()
	{
		this.root = createTree(null, "");
	}
	private Node createTree(Node parent, String lr)
    {
        if(parent==null)
        {
            System.out.println("Enter root node value: ");
        }
        else{
            System.out.println("Enter the vaue of "+lr+" child of "+ parent.data);
        }
        
        int n = sc.nextInt();
        Node nr = new Node(n);
        System.out.println("Is there a left child of "+n);
        boolean f = sc.nextBoolean();
        if(f){
            nr.left = createTree(nr,"left");
        }
        System.out.println("Is there a right child of "+n);
        f = sc.nextBoolean();
        if(f){
            nr.right = createTree(nr,"right");
        }
        return nr;
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
		return this.find(root, ele);
	}
	private boolean find(Node r,int ele)
	{
		if(r == null)
		{
			return false;
		}
		else
		{
			return r.data == ele || find(r.left,ele) || find(r.right,ele);
		}
	}
	
	public int max()
	{
		return this.max(root);
	}
	private int max(Node r)
	{
		if(r == null)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return Math.max(r.data, Math.max(max(r.left), max(r.right)));
		}
	}
	public void preorder()
	{
		this.preorder(root);
	}
	
	private void preorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			System.out.print(r.data+" ");
			preorder(r.left);
			preorder(r.right);
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
			inorder(r.left);
			System.out.print(r.data+" ");
			inorder(r.right);
		}
	}
	
	public void postorder()
	{
		this.postorder(root);
	}
	
	private void postorder(Node r)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data+" ");
		}
	}
	public void bfs()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		int counter = 1;
		while(!qt.isEmpty())
		{
			Node r = qt.remove();
			counter--;
			System.out.print(r.data+" ");
			if(r.left!=null)
				qt.add(r.left);
			if(r.right!=null)
				qt.add(r.right);
			if(counter == 0)
			{
				System.out.println();
				counter = qt.size();
			}
		}
	}
	public void leftView()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		int counter = 1;
		System.out.print(qt.peek().data+" ");
		while(!qt.isEmpty())
		{
			Node r = qt.remove();
			counter--;
//			System.out.print(r.data+" ");
			if(r.left!=null)
				qt.add(r.left);
			if(r.right!=null)
				qt.add(r.right);
			if(counter == 0 && qt.size() != 0)
			{
				System.out.print(qt.peek().data+" ");
				counter = qt.size();
			}
		}
	}
	
	public void rightView()
	{
		Queue<Node> qt = new LinkedList<>();
		qt.add(root);
		int counter = 1;
//		System.out.print(qt.peek().data+" ");
		while(!qt.isEmpty())
		{
			Node r = qt.remove();
			counter--;
//			System.out.print(r.data+" ");
			if(r.left!=null)
				qt.add(r.left);
			if(r.right!=null)
				qt.add(r.right);
			if(counter == 0)
			{
				System.out.print(r.data+" ");
				counter = qt.size();
			}
		}
	}
	
	public void verticalOrder()
	{
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		vo(root, 0, map);
		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);
		for(int key:keys)
		{
			System.out.println(key+" : "+map.get(key));
		}
	}
	
	private void vo(Node r,int vlvl,HashMap<Integer, ArrayList<Integer>> map)
	{
		if(r == null)
		{
			return;
		}
		else
		{
			if(map.containsKey(vlvl))
			{
				map.get(vlvl).add(r.data);
			}
			else
			{
				map.put(vlvl, new ArrayList<>(Arrays.asList(r.data)));
			}
			vo(r.left, vlvl-1, map);
			vo(r.right, vlvl+1, map);
		}
	}
	
	
	
	
	
	
	
	
	
	

}





