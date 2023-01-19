package Lec29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	static class Interval{
		int si;
		int ei;
		
		Interval(int s,int e)
		{
			this.si = s;
			this.ei = e;
		}
		
		@Override
		public String toString()
		{
			return this.si+" "+this.ei;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interval[] inv = new Interval[8];
		inv[0] = new Interval(1, 3);
		inv[1] = new Interval(2, 4);
		inv[3] = new Interval(5, 7);
		inv[2] = new Interval(6, 8);
		inv[4] = new Interval(7, 9);
		inv[7] = new Interval(10, 15);
		inv[6] = new Interval(12, 13);
		inv[5] = new Interval(18, 20);
		
		
		Arrays.sort(inv,new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				return o1.si-o2.si;
			}
		});
		
		for(Interval i:inv)
		{
			System.out.println(i);
		}
		
		ArrayList<Interval> ans = new ArrayList<>();
		Interval a = new Interval(inv[0].si,inv[0].ei);
		for(int i = 1;i < inv.length; i++)
		{
			if(a.ei > inv[i].si)
			{
				a.ei = Math.max(a.ei, inv[i].ei);
			}
			else
			{
				ans.add(a);
				a = new Interval(inv[i].si,inv[i].ei);
			}
		}
		ans.add(a);
		System.out.println(ans);
		

	}

}
