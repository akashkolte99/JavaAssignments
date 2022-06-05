package com.ass1;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	
public static void main(String args[]) {
	
	try {
    System.out.println("start of main..");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter num1");
    int num1 = sc.nextInt();
    System.out.println("Enter num2");
    int num2 = sc.nextInt();
    
    
    String message = "Welcome To Java";
    
    int num3 = num1 / num2;
    if(num3 > 10){
     message = "Welcome to Exception Handling ";
         }
      System.out.println("Message is :"+message.toUpperCase());
   }
	catch (ArithmeticException ae){
		System.out.println("num2 should not be 0");
	}
	catch (NullPointerException n) {
		System.out.println("String value is null");
		
	}
	catch (InputMismatchException im) {
		System.out.println("Please enter valid number");
	}
   System.out.println("end of main");
	
 }
}
