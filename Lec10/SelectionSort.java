package Lec10;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,4,5,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int minI = i;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[minI] > arr[j])
				{
					minI = j;
				}
			}
			int t = arr[i];
			arr[i] = arr[minI];
			arr[minI] = t;
		}	
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swap++;
				}
			}
			if(swap == 0)
			{
				break;
			}
		}
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 1;i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
}
