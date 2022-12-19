package Lec24;

public class Car { //implements Comparable<Car>
	
	int price;
	int speed;
	String color;
	
	Car(int price,int speed,String color)
	{
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	
	@Override
	public String toString()
	{
		return "P: "+this.price+" S: "+this.speed+" C: "+this.color;
	}

//	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		
//		return this.price-o.price;
//		return this.speed-o.speed;
		return this.color.compareTo(o.color);
	}
	
	
	
}
