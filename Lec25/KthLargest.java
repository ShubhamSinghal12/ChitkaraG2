package Lec25;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k = 4;
		
//		HeapG<Integer> hp = new HeapG<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
//		for(int i = 0; i < k; i++)
//		{
//			pq.add(nums[i]);
//		}
//		for(int i = k; i < nums.length; i++)
//		{
//			if(pq.peek() < nums[i])
//			{
//				pq.remove();
//				pq.add(nums[i]);
//			}
//		}
//		System.out.println(pq.peek());
		
		for(int i = 5; i >= 1; i--)
			pq.add(i);
		
		while(!pq.isEmpty())
			System.out.println(pq.poll());
	}

}
