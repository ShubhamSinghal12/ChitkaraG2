package Lec26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		arr.add(new ArrayList<>(Arrays.asList(1,4,5)));
		arr.add(new ArrayList<>(Arrays.asList(1,3,4)));
		arr.add(new ArrayList<>(Arrays.asList(2,6)));
		
		System.out.println(mergeK(arr));

	}
	public static class Pair{
		int val;
		int listNo;
		int listIndex;
		
		Pair(int val,int ln,int li)
		{
			this.val= val;
			this.listNo = ln;
			this.listIndex = li;
		}
	}
	
	public static ArrayList<Integer> mergeK(ArrayList<ArrayList<Integer>> arr)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});
		
		for(int i = 0; i < arr.size(); i++)
		{
			pq.add(new Pair(arr.get(i).get(0),i,0));
		}
		
		while(!pq.isEmpty())
		{
			Pair r = pq.remove();
			ans.add(r.val);
			
			r.listIndex = r.listIndex+1;
			if(r.listIndex < arr.get(r.listNo).size())
			{
				r.val = arr.get(r.listNo).get(r.listIndex);
				pq.add(r);
			}
		}
		return ans;	
	}
}
