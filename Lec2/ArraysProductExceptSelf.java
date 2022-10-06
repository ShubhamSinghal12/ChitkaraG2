package Lec2;

import java.util.Arrays;

public class ArraysProductExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] lp = new int[arr.length];
		int prod = 1;
		for(int i = 0; i < arr.length; i++)
		{
			lp[i] = prod;
			prod = prod*arr[i];
		}
		int rp[] = new int[arr.length];
		prod = 1;
		for(int i = arr.length-1; i >= 0; i--)
		{
			rp[i] = prod;
			prod = prod*arr[i];
		}
		System.out.println(Arrays.toString(rp));

	}

}
