package com.Day3;

public class NonStatic {

	static int x = 10;
	int y =5;
	public static void main(String[] args) {
//		DIFFERENCE BETWEEN STATIC AND NOT-STATIC
		
//		Static :- A Block of code would be loaded into the RAM before it is executed (after being loaded into RAM , it may or may not execute)
//		so as above you can see variable x so we can directly access it from main method
		
		System.out.println(x + " "+"Static");
//      Non - Static : - Every method in Java defaults to a non-static method if it doesn't have the static keyword before it. Non-static methods can access every static method and static variable without creating an instance of the object. Dynamic or runtime binding is utilized with non-static methods
//		and if you directly try to get non static variable its showing the error
		
//		System.out.println(y); this line showing error if we try to access it directly
//		so for getting this we have to create an Object 
		
		NonStatic NS = new NonStatic();
		
		System.out.println(NS.y+" "+"Non Static");
	}
}
