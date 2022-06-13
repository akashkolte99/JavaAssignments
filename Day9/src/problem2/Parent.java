package problem2;

public abstract class Parent {
	final int number;
	
	
	public int getNumber() {
		return this.number;
	}
	
	
	public Parent(int num) {
		number = num;
	}
	
	public abstract void method1();
	
	public final void method2() {
		System.out.println("I am inside 2nd method of Parent Class");
	}
	
	 void method3() {
		System.out.println("I am inside 3rd method of Parent Class");
	} 
}

