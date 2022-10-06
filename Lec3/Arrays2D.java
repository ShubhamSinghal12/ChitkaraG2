package Lec3;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[3][4];
		int[] arr[]= new int[2][];
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0] = new int[4];
		arr[1] = new int[10];
		for(int i = 0; i < arr.length;i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
