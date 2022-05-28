package com.practice;

public class Main extends A {

	void funX() {
		System.out.println("im from funx main");
	}
	public static void main(String[] args) {
		Main m1= new Main();
		
		m1.funA();
		m1.funX();
	}
}
