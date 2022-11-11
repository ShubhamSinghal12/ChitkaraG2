package Lec8;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,7,6,5,10,4,8};
		nextG(arr);

	}
	
	public static int[] nextG(int[] arr)
	{
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[st.peek()] < arr[i])
			{
//				int ind = st.pop();
//				ans[ind] = arr[i];
				st.pop();
			}
			st.push(i);
		}
		while(!st.isEmpty())
		{
			ans[st.pop()] = -1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(st);
		System.out.println(Arrays.toString(ans));
		return ans;
	}

}
