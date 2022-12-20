package Lec25;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapG<String> hp = new HeapG<>();
		hp.add("10");
		hp.add("30");
		hp.add("20");
		hp.add("50");
		hp.add("70");
		hp.add("60");
		hp.add("40");
		
		hp.display();
		System.out.println(hp.getMax());
		hp.remove();
		hp.display();

	}

}
