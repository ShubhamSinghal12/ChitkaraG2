package Lec11;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		System.out.println(binarySearch(arr, 3));

	}
	public static int binarySearch(int[] arr,int ele)
	{
		int si = 0;
		int ei = arr.length-1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(arr[mid] > ele)
			{
				ei = mid-1;
			}
			else
			{
				si = mid+1;
			}
		}
		return -1;
	}

}
