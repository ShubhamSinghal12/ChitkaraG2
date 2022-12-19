package Lec23;

public interface Test2 {

	void hello2();
	default void h1() {
		System.out.println("Hello Test");
	}
}
