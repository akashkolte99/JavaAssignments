package com.Problem2;

class Main{
	
   public static void main(String[] args) {
	
	   Animal a = new Animal();
	   a.funx();
	   
	   Dog d = (Dog)a;
	   a.fund();
}
}
		
//		ClasscastException :-
//		We can downcast the parent class variable to the child class object only if
//		the Parent class variable points to the Child class object , otherwise it will throw a
//		runtime exception called ClassCastException.

