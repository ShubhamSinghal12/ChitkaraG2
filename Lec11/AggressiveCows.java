package Lec11;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = {1,2,4,8,9};
		int c = 3;
		int ans = 0;
		for(int i = 1; i < stalls[stalls.length-1]; i++)
		{
			if(isItPossible(stalls, c, i))
				ans = i;
			else
			{
				break;
			}
		}
		System.out.println(ans);
//		System.out.println(isItPossible(stalls, c, 4));
		System.out.println(agc(stalls, c));

	}
	public static int agc(int[] stalls,int c)
	{
		int si = 1;
		int ei = stalls[stalls.length-1];
		int ans = 1;
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(stalls, c, mid))
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
	
	public static boolean isItPossible(int[] stalls,int c,int md)
	{
		int noc = 1;
		int lp = stalls[0];
		for(int i = 0; i < stalls.length; i++)
		{
			if(stalls[i]-lp >= md)
			{
				noc++;
				lp = stalls[i];
			}
		}
		return noc >= c;
	}
}
