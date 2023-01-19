package Lec29;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
	
	
	static class Items{
		int w;
		int val;
		
		Items(int w,int val)
		{
			this.w = w;
			this.val = val;
		}
		
		@Override
		public String toString()
		{
			return this.w+" "+this.val;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Items[] it = new Items[6];
		it[0] = new Items(50,1000);
		it[1] = new Items(20,2000);
		it[2] = new Items(70,800);
		it[3] = new Items(80,2500);
		it[4] = new Items(60,1500);
		it[5] = new Items(10,1500);
		
		Arrays.sort(it,new Comparator<Items>() {

			@Override
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				double p1 = (double)o1.val/o1.w;
				double p2 = (double)o2.val/o2.w;
				
				if(p2>p1)
					return 1;
				else if(p1==p2)
					return 0;
				else
					return -1;
				
			}
		});
		
		for(Items i : it)
		{
			System.out.println(i);
		}
		
		int profit = 0;
		int capacity = 100;
		for(int i = 0; i < it.length; i++)
		{
			if(capacity >= it[i].w)
			{
				profit += it[i].val;
				capacity -= it[i].w;
			}
			else
			{
				profit += capacity*it[i].val/it[i].w;
				break;
			}
		}
		System.out.println(profit);
		

	}

}
