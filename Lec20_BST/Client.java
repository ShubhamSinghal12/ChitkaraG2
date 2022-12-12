package Lec20_BST;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60,70};
		BST bt = new BST();
		bt.createTree(arr);
		bt.add2(15);
//		bt.add2(20);
//		bt.add2(10);
//		bt.display();
//		System.out.println("---------------------");
//		bt.delete(40);
//		bt.display();
		bt.inorder();

	}

}
