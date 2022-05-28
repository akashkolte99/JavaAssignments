package com.problem4;

public class Main {

	public static void main(String[] args) {
		
		
		Animal [] a = new Animal[3];
		
		a[0] =new Dog();
		a[1]=new Cat();
		a[2]=new Tiger();
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("==============");
			
			a[i].eat();
			a[i].walk();
			a[i].makeNoise();
			
			System.out.println("==============");

		}
	}
}
