package Lec26;

import java.util.ArrayList;
import java.util.HashMap;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int[] intersect(int[] nums1, int[] nums2) {
		  ArrayList<Integer> ans = new ArrayList<>();
		  
		  HashMap<Integer, Integer> map = new HashMap<>();
		  for(int i = 0; i < nums1.length; i++)
		  {
			  map.put(nums1[i],map.getOrDefault(nums1[i], 0)+1);
		  }
		  for(int i = 0; i < nums2.length;i++)
		  {
			  int f = map.getOrDefault(nums2[i], 0);
			  if(f > 0)
			  {
				  ans.add(nums2[i]);
				  map.put(nums2[i], f-1);
			  }
		  }
		  int[] arr = new int[ans.size()];
		  
		  for(int i = 0 ; i < ans.size(); i++)
			  arr[i] = ans.get(i);
		  
		  return arr;
		  
	  }

}
