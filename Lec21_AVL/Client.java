package Lec21_AVL;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL_Tree at = new AVL_Tree();
		for(int i = 1; i <= 10; i++)
			at.insert(i);
		at.display();
		System.out.println("------------------");
		at.delete(1);
		at.delete(3);
		at.display();

	}

}
