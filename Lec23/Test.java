package Lec23;

public interface Test extends Test1,Test2{
	
	static final int m = 10;
	void hello();
	
	default void h1() {
		System.out.println("Hello Test");
		hp();
	}
	
	static void hs()
	{
		System.out.println("Static hello Test");
	}
	private void hp()
	{
		System.out.println("Private hello Test");
	}
	
}
