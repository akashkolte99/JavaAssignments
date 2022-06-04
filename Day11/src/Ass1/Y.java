package Ass1;

public interface Y {

    public void fun1y();
	
	default void fun2y() {
		System.out.println(" Y inside interface Y fun2x");
	}
	
	static void fun3y() {
		System.out.println("Y inside interface Y fun3x");
	}
}
