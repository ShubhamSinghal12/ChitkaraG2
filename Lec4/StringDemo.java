package Lec4;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hello";
		String st1 = "Hello";
		String st2 = new String("Hello");
		
//		st = st + true;
//		System.out.println(st);
//		System.out.println(2+3+" "+6+10);
//		System.out.println(st.equals(st2));
//		System.out.println(st.charAt(0));
//		System.out.println(st.length());
//		System.out.println(st.substring(1,4));
//		System.out.println(st.substring(1));
//		System.out.println(st.indexOf("el"));
//		System.out.println(st.lastIndexOf("el"));
//		System.out.println(st.startsWith("e"));
//		System.out.println("---------------------------------");
//		allSS("abcde");
//		System.out.println("-----------------------------------");
//		System.out.println(isPalindrome("abbb"));
//		System.out.println(reverse(st));
//		allPalindromcSS("abxba");
		System.out.println(countPSS("nitinn"));
		

	}
	public static void allSS(String s)
	{
		for(int i = 0; i < s.length();i++)
		{
			for(int j = i; j < s.length();j++)
			{
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	public static void allPalindromcSS(String s)
	{
		for(int i = 0; i < s.length();i++)
		{
			for(int j = i; j < s.length();j++)
			{
				if(isPalindrome(s.substring(i,j+1)))
				{
					System.out.println(s.substring(i, j+1));
				}
			}
		}
	}
	
	public static boolean isPalindrome(String s)
	{
		int si = 0;
		int ei = s.length()-1;
		while(si < ei)
		{
			if(s.charAt(si) != s.charAt(ei))
			{
				return false;
			}
			si++;
			ei--;
		}
		return true;
		
	}
	public static String reverse(String s)
	{
		String rev = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			rev += s.charAt(i);
		}
		return rev;
	}
	public static boolean isPalindrome2(String s)
	{
		return s.equals(reverse(s));
	}
	public static int countPSS(String s)
	{
		int count = 0;
		//Odd Length
		for(int i =0; i < s.length(); i++)
		{
			count++;
			System.out.println(s.charAt(i));
			int si = i-1;
			int ei = i+1;
			while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei))
			{
				System.out.println(s.substring(si,ei+1));
				count++;
				si--;
				ei++;
			}
		}
		
		for(int i =0; i < s.length()-1; i++)
		{
			int si = i;
			int ei = i+1;
			while(si >= 0 && ei < s.length() && s.charAt(si) == s.charAt(ei))
			{
				System.out.println(s.substring(si,ei+1));
				count++;
				si--;
				ei++;
			}
		}
		return count;
	}
}
