package com.ass4;

public class Main {

	public static void main(String[] args) {
		if(args.length==1) {
			String s = args[0];
			int i1 = Integer.parseInt(s);
			
			int x = i1*(i1-1);
			System.out.println(x);
			
		}else if(args.length==2){
			
			String s1 = args[0];
			String s2 = args[1];
			
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			
			int c = Math.abs(a-b);
			
			int d = c*(c-1);
			
			System.out.println(d);
			
			
		}else if(args.length>=3) {
			
			System.out.println("Error");
			
		}
	}
}

//Case1-
//If only one number is supplied then simply find the factorial of that number
//
//Ex- input-
//5
//
//Output-
//120
//
//Case2-
//If two numbers are supplied then find the absolute difference of the two numbers and then find
//the factorial of the resulting number.
//
//input-
//5 7
//
//Output-
//2! (absolute difference of 5 & 7 is 2)
//
//Case 3-
//
//If three or more numbers are supplied-
//Input-
//5 6 8 9
//
//Output-
//Error