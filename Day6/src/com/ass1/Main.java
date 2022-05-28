package com.ass1;

import java.util.Scanner;

public class Main {
	
	public static String reversString(String input){
	//write the logic
		char[] str = input.toCharArray();
		String result  = "";
		for(int i=input.length()-1;i>=0;i--) {
			result+=str[i];
		}
		return result;
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String os = sc.next();
	String result = reversString(os);
	System.out.println("Original String is :"+ os);
	System.out.println("Reversed String is :"+ result);
	}
	
}
