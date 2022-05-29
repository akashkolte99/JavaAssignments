package problem2;

import java.util.Scanner;

public final class Child extends Parent{	
	@Override
	public void method1() {
		System.out.println(getNumber());
		System.out.println("I am From method 1 of Child class");
	}
	
	public void method4() {
		System.out.println("I am From method 4 of Child class");
	}
	
	public Child(int i) {
		super(i);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 10 : ");
		int  x = sc.nextInt();
		if(x >= 1 && x <= 10) {
			Parent var = new Child(x);
			var.method1();
			var.method2();
			var.method3();
		}
		else {
			System.out.println("Enter Corect Number Between 1 to 10");
		}
		
	}
}