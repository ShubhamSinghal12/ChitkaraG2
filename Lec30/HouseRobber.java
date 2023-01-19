package Lec30;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		System.out.println(houseRobTD(nums, 0, dp));

	}
	
	public static int houseRob(int[] nums,int i)
	{
		if(i >= nums.length)
			return 0;
		int r = nums[i]+houseRob(nums, i+2);
		int nr = houseRob(nums, i+1);
		return Math.max(r, nr);
	}
	
	public static int houseRobTD(int[] nums,int i,int[] dp)
	{
		if(i >= nums.length)
			return 0;
		if(dp[i] != -1)
			return dp[i];
		int r = nums[i]+houseRob(nums, i+2);
		int nr = houseRob(nums, i+1);
		return dp[i] = Math.max(r, nr);
	}
	
	public static int hrBU(int[] nums)
	{
		int[] dp = new int[nums.length+2];
		
		for(int i = nums.length-1;i >= 0; i--)
		{
			int r = nums[i]+dp[i+2];
			int nr = dp[i+1];
			dp[i] = Math.max(r, nr);
		}	
		return dp[0];
	}
}
