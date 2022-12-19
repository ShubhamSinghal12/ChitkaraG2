package Lec24;

import java.util.Comparator;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Integer[] arr = {100,20,300,40,500};
//		String[] st = {"i","am","shubham","singhal"};
//		display(arr);
//		display(st);
//		bubbleSort(arr);
//		bubbleSort(st);
//		display(arr);
//		display(st);
		
		Car[] cars = new Car[5];
		cars[0] = new Car(10000,80,"Green");
		cars[1] = new Car(11000,60,"Red");
		cars[2] = new Car(12500,150,"Black");
		cars[3] = new Car(1000,40,"Red");
		cars[4] = new Car(13500,120,"Green");
		
//		bubbleSort(cars,new SpeedComparator());
		bubbleSort(cars,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				int a = o1.color.compareTo(o2.color);
				if(a==0)
					return o2.speed-o1.speed;
				else 
					return a;
			}
		});
		
		display(cars);
//		System.out.println(cars[0]);
		
	}
	public static <T> void display(T[] arr)
	{
		for(T i: arr)
			System.out.println(i);
	}
	
	
	public static <T> void bubbleSort(T[] arr,Comparator<T> comp)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(comp.compare(arr[j], arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swap++;
				}
			}
			if(swap == 0)
			{
				break;
			}
		}
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			int swap = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					T t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swap++;
				}
			}
			if(swap == 0)
			{
				break;
			}
		}
	}
}
