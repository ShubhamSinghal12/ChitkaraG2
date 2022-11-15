package Lec9;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 24;
		int b = 13;
		
//		int gcd = 1;
//		for(int i = 1; i <= a; i++)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				gcd = i;
//			}
//		}
//		System.out.println(gcd);
		
//		int gcd = 1;
//		for(int i = a; i >= 1; i--)
//		{
//			if(a%i == 0 && b%i == 0)
//			{
//				gcd = i;
//				break;
//			}
//		}
//		System.out.println(gcd);
		System.out.println(gcd(Math.max(a, b),Math.min(a, b)));

	}
	
	public static int gcd(int a,int b)
	{
		while(a%b!=0)
		{
			int c = a%b;
			
			a = b;
			b = c;
		}
		return b;
	}
	
}
