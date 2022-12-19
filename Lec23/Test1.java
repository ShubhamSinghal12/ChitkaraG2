package Lec23;

public interface Test1{

	void hello1();
	default void h1() {
		System.out.println("Hello Test");
	}
}
