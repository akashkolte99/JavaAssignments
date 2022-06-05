package com.ass2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		if(Pattern.matches("[a-zA-Z]{3,8}",name )&& Pattern.matches("\\d{12}", aadharCard)&& Pattern.matches("[6789]{1}\\d{9}", mobileNum))
      return true;
		else
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		System.out.println("Enter Mobile Number");
		String mob = sc.next();
		
		System.out.println("Enter AadharCard Number");
		String adc = sc.next();
		Demo d = new Demo();
		
		if(d.validate(name, mob, adc)) {
			Citizen c1 =new Citizen();
			
			c1.setName(name);
			c1.setMobileNumber(mob);
			c1.setAadharNumber(adc);
			
			System.out.println("=================================");
			System.out.println("Citizen Name"+" "+c1.getName());
			System.out.println("Citizen Mobile Number"+" "+c1.getMobileNumber());
			System.out.println("Citizen Aadhar Card"+" "+c1.getAadharNumber());
		}else {
			System.out.println("the appropriate validation error message.");
		}
	}
}
