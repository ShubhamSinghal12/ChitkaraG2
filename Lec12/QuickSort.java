package Lec12;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,3,7,8,2,1,5};
//		int j = partition(arr,0,arr.length-1);
		qs(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static int partition(int[] arr,int si,int ei)
	{
		int j = si;
		for(int i = si; i < ei; i++)
		{
			if(arr[ei] > arr[i])
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				j++;
			}
		}
		int t = arr[ei];
		arr[ei] = arr[j];
		arr[j] = t;
		
		return j;
	}
	
	public static void qs(int[] arr,int si,int ei)
	{
		if(si >= ei)
		{
			return;
		}
		else
		{
			int p = partition(arr, si, ei);
			qs(arr, si, p-1);
			qs(arr, p+1, ei);
		}
	}

}
