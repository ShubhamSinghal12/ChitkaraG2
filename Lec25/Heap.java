package Lec25;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> heap = new ArrayList<>();
	
	public boolean isEmpty()
	{
		return heap.isEmpty();
	}
	public int size()
	{
		return heap.size();
	}
	
	public void add(int ele)
	{
		heap.add(ele);
		upheapify(heap.size()-1);
	}
	
	private void swap(int a,int b)
	{
		int t = heap.get(a);
		heap.set(a, heap.get(b));
		heap.set(b, t);
	}
	private void upheapify(int ci)
	{
//		if(ci == 0)
//			return;
		
		int pi = (ci-1)/2;
		if(heap.get(ci) > heap.get(pi))
		{
			swap(ci,pi);
			upheapify(pi);
		}
	}
	
	public int getMax()
	{
		return heap.get(0);
	}
	
	public int remove()
	{
		swap(0,heap.size()-1);
		int x = heap.remove(heap.size()-1);
		downheapify(0);
		return x;
	}
	private void downheapify(int pi)
	{
		int lc = 2*pi+1;
		int rc = 2*pi+2;
		
		int max = pi;
		if(lc < heap.size() && heap.get(max) < heap.get(lc))
		{
			max = lc;
		}
		if(rc < heap.size() && heap.get(max) < heap.get(rc))
		{
			max = rc;
		}
		
		if(max != pi)
		{
			swap(max,pi);
			downheapify(max);
		}
	}
	
	public void display()
	{
		System.out.println(heap);
	}
	

}
