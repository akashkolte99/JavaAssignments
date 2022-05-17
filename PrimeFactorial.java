package com.First;

public class PrimeFactorial {

	public static void main(String[] args) {
		
		int n = 12 ;
		
		if(n<2 || n>100) {
			System.out.println("Invalid number");
		}else {
			String jhola = "";
			for(int i=1;i<=n;i++){
				if(n%i==0) {
					jhola+=i+" ";
				}
			}
			System.out.println(jhola);
		}
	}
}

//
//The prime factors of a number are all of the integers below that number that are divisible into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6, and 12.
//Write a Java class with a static method that will take a number and print all the prime factorial of that number.
//The Supplied number should be between 2 and 100. otherwise, it should print “Invalid number”.
//Call this method from the main method by suppling any valid argument.