package com.practice;

public class Dog extends Animals {

	@Override
	void eat() {
		System.out.println("Dog can eat");
	}
	void display()
	{
		System.out.println("display");
		super.eat();
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		
		
		d.age=22;
		System.out.println(d.age);
		d.
		display();
		
	}
}
