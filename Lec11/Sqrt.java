package Lec11;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 36;
		int ans = 0;
		for(int i = 1; i < n; i++)
		{
			if(isItPossible(i, n))
				ans = i;
			else
			{
				break;
			}
		}
		System.out.println(ans);
		System.out.println(sqrt(n));

	}
	public static int sqrt(int n)
	{
		int si = 1;
		int ei = n;
		int ans = 1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(mid, n))
			{
				ans = mid;
				si = mid+1;
			}
			else
			{
				ei = mid-1;
			}
		}
		return ans;
	}
	
	public static boolean isItPossible(int i,int ele)
	{
		return i*i <= ele;
	}

}
