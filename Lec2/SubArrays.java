package Lec2;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-2,-3,-4,-5};
//		int maxSum = Integer.MIN_VALUE;
//		for(int si = 0;si < arr.length; si++)
//		{
//			int sum = 0;
//			for(int ei = si; ei < arr.length; ei++)
//			{
//				sum += arr[ei];
////				int sum = 0;
////				for(int k = si; k <= ei; k++)
////				{
////					sum+= arr[k];
//////					System.out.print(arr[k]);
////				}
//				if(sum > maxSum)
//					maxSum = sum;
////				System.out.println(sum);
//			}
//		}
//		System.out.println(maxSum);
		
		kadanes(arr);
	}
	public static void kadanes(int[] arr)
	{
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			maxSum = Math.max(maxSum, sum);
			if(sum < 0)
			{
				sum = 0;
			}
//			if(sum > maxSum)
//			{
//				maxSum = sum;
//			}
		}
		System.out.println(maxSum);
	}

}
