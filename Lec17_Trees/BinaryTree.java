package Lec17_Trees;

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
	Node root;
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
	public void display(Node r)
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
	
	

}





