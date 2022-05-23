package com.masai;

public class Demo {

   public  Demo () {
	   System.out.println("it is  Empty ");
	};
	public Demo (String a) {
		this();
		System.out.println("it is a String "+ a);
	}
	public Demo(int x) {
		this("Akash");
		System.out.println("it is a int "+ x);
	}
	
	public Demo (float a) {
		this(4);
		System.out.println("it is a float "+ a);
	}
	void Demo1(){
		
	}
	public static void main(String[] args) {
		
		Demo d1 = new Demo (10.55f);

		d1.Demo1();
		
	}
}
