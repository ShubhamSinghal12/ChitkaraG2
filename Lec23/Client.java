package Lec23;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p = new Person();
//		p.hello();
////		Person.m = 100;
//		System.out.println(Person.m);
//		p.h1();
//		Test.hs();
		
//		Test obj = new Person();
//		obj.hello();

		Anm obj = new Anm(){
			@Override
			public void sayHi() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous says Hi");
			}};
		obj.sayHi();
		
	}

}
