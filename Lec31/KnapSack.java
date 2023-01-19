package Lec31;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = {1,2,3,2,2};
		int[] cost = {8,4,8,6,5};
		int cap = 4;
		System.out.println(knap(wt, cost, cap, 0));
		int[][] dp = new int[cap+1][wt.length];
		System.out.println(knapTD(wt, cost, cap, 0, dp));
		knapBU(wt, cost, cap);

	}
	
	public static int knap(int[] wt,int[] cost,int cap,int i)
	{
		if(i >= wt.length)
		{
			return 0;
		}
		else
		{
			int inc = 0;
			if(cap >= wt[i])
			{
				inc = cost[i]+knap(wt, cost, cap-wt[i], i+1);
			}
			int exc = knap(wt, cost, cap, i+1);
			return Math.max(inc, exc);
		}
	}
	
	public static int knapTD(int[] wt,int[] cost,int cap,int i,int[][] dp)
	{
		if(i >= wt.length)
		{
			return 0;
		}
		if(dp[cap][i] != 0)
			return dp[cap][i];
		else
		{
			int inc = 0;
			if(cap >= wt[i])
			{
				inc = cost[i]+knapTD(wt, cost, cap-wt[i], i+1,dp);
			}
			int exc = knapTD(wt, cost, cap, i+1,dp);
			return dp[cap][i] = Math.max(inc, exc);
		}
	}
	
	public static void knapBU(int[] wt,int[] cost,int cap)
	{
		int[][] dp = new int[cap+1][wt.length+1];
		
		
		for(int j = wt.length-1;j >= 0; j--)
		{
			for(int i = 0; i <= cap; i++)
			{
				int inc = 0;
				if(i >= wt[j])
				{
					inc = cost[j]+dp[i-wt[j]][j+1];
				}
				int exc = dp[i][j+1];
				dp[i][j] = Math.max(inc, exc);
			}
		}
		
		System.out.println(dp[cap][0]);
	}
	

}
