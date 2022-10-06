package Lec1_Introduction;

public class DoubleSidedArrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nst = 1;
		int nsp1 = n-1;
		int nsp2 = -1;
		int val = 1;
		while(row <= n)
		{
			//Work
			for(int csp = 1; csp <= nsp1; csp++)
			{
				System.out.print("  ");
			}
			for(int cst = 1,cval = val; cst <= nst; cst++,cval--)
			{
				System.out.print(cval+" ");
			}
			for(int csp = 1; csp <= nsp2; csp++)
			{
				System.out.print("  ");
			}
			if(row != 1 && row != n)
			{
				for(int cst = 1,cval = 1; cst <= nst; cst++,cval++)
				{
					System.out.print(cval+" ");
				}
			}
			
			if(row <= n/2)
			{
				val += 1;
				nsp1 -= 2;
				nsp2 += 2;
				nst += 1;
			}
			else
			{
				val -= 1;
				nsp1 += 2;
				nsp2 -= 2;
				nst -= 1;
			}
			row += 1;
			System.out.println();
		}

	}

}
