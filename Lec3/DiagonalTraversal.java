package Lec3;

public class DiagonalTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		
		int i = 0, j = 0;
		for(; i < arr.length; i++)
		{
			int x = i;
			int y = j;
		
			while(x >= 0 && y <= arr[0].length-1)
			{
	//			System.out.println(i+" "+j);
				System.out.print(arr[x][y]+" ");
				x--;
				y++;
			}
			System.out.println();
		}
		for(i = arr.length-1,j = 1; j < arr[0].length; j++)
		{
			int x = i;
			int y = j;
		
			while(x >= 0 && y <= arr[0].length-1)
			{
	//			System.out.println(i+" "+j);
				System.out.print(arr[x][y]+" ");
				x--;
				y++;
			}
			System.out.println();
		}

	}

}
