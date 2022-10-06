package Lec1_Introduction;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n/2;
		while(row <= n)
		{
			//Work
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			//Update
//			row += 1;
//			System.out.println();
			if(row <= n/2)
			{
				nst += 2;
				nsp -= 1;
			}
			else {
				nst -= 2;
				nsp += 1;
			}
			row += 1;
			System.out.println();
		}

	}

}
