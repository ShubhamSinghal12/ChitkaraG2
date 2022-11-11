package Lec7;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		rev3(st);
		System.out.println(st);
		
	}
	
	public static void reverseStack(Stack<Integer> st)
	{
//		Stack<Integer> temp1 = new Stack<>();
//		while(!st.isEmpty())
//		{
//			temp1.push(st.pop());
//		}
//		
//		Stack<Integer> temp2 = new Stack<>();
//		while(!temp1.isEmpty())
//		{
//			temp2.push(temp1.pop());
//		}
		
		Stack<Integer> temp2 = new Stack<>();
		rev2(st, temp2);
		while(!temp2.isEmpty())
		{
			st.push(temp2.pop());
		}
	}
	
	public static void revDisplay(Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
			System.out.println(x);
			revDisplay(st);
			st.push(x);
		}
	}
	
	public static void rev2(Stack<Integer> st,Stack<Integer> temp)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
//			System.out.println(x);
			rev2(st,temp);
			temp.push(x);
		}
	}
	
	public static void insert(Stack<Integer> st,int t)
	{
		if(st.isEmpty())
		{
			st.push(t);
		}
		else
		{
			int x = st.pop();
//			System.out.println(x);
			insert(st,t);
			st.push(x);
		}
	}
	
	public static void rev3(Stack<Integer> st)
	{
		if(st.isEmpty())
		{
			return;
		}
		else
		{
			int x = st.pop();
//			System.out.println(x);
			rev3(st);
			insert(st, x);
		}
	}

}
