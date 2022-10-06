package Lec3;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int si = 0;
		int ei = arr.length-1;
		while(si < ei)
		{
			swap(arr,si,ei);
			si++;
			ei--;
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

}
