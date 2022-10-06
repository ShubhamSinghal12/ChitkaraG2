package Lec3;

import java.util.Arrays;

public class TargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1,3,5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int target = 5;
		int si = 0;
		int ei = arr.length-1;
		while(si < ei)
		{
			if(arr[si]+arr[ei] == target)
			{
				System.out.println(arr[si]+" "+arr[ei]);
				si++;
				ei--;
			}
			else if(arr[si]+arr[ei] > target)
			{
				ei--;
			}
			else
			{
				si++;
			}
		}

	}

}
