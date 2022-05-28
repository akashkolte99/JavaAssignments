package com.prob4;

import java.util.Scanner;

public class Demo {

	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
//			System.out.println("a");
			return new Axis();
		}else if(bank.equals("icici")) {
//			System.out.println("i");

			return new Icici();
		}else {
			System.out.println("null");

			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bank Name : ");
		String x = sc.next();
		
		Demo d1 = new Demo();
		
		Bank obj =d1.getBank(x);
//
//		if(obj instanceof Axis) {
//			System.out.println("axis yes");
//		}
//		
		System.out.println("====================");
		if(obj instanceof Axis) {
			Axis a =(Axis)obj;
			a.displayDetails();
			a.getCreditCard();
		}else if(obj instanceof Icici) {
			Icici i = (Icici)obj;
			i.displayDetails();
		}
		else {
			System.out.println("Wrong Bank");
		}
	}
}
