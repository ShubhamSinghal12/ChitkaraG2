package Lec5;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("123");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		

	}

}
