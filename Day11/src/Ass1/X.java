package Ass1;

public interface X {

	public void fun1x();
	
	default void fun2x() {
		System.out.println("X inside interface X fun2x");
	}
	
	static void fun3x() {
		System.out.println("X inside interface X fun3x");
	}
}
