package Lec26;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

	public int longestConsecutive(int[] nums) {
		
		int maxs = 0;
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < nums.length; i++)
		{
			hs.add(nums[i]);
		}
		for(int k : hs)
		{
			if(!hs.contains(k-1))
			{
				int v = k+1;
				int count = 1;
				while(hs.contains(v))
				{
					v += 1;
					count += 1;
				}
				//count = v-k;
				Math.max(count, maxs);
			}
		}
		return maxs;
    }

}
