package Lec5;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The Sky is Blue";
		String[] temp = s.split(" ");
		String ns = "";
		for(int i = temp.length-1; i >= 0; i--)
		{
			ns += temp[i] + " ";
		}
		System.out.println(ns);
	}

}
