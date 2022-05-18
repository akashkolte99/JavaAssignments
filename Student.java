package com.Day3;

public class Student {

	String name;
	int roll;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is :"+" "+ roll);
		System.out.println("Name is :"+" "+ name);
		System.out.println("Marks is :"+" "+ marks);
	}
	
	public static void main (String[] args) {
		
		Student s1 = new Student();
		s1.name="Akash";
		s1.roll=0455;
		s1.marks=75;
		
		
		s1.displayStudentDetails();
		s1=null;
		System.out.println(" ");
		
		Student s2 = new Student();
		s2.name="Mohit";
		s2.roll=0375;
		s2.marks=75;
		
		
		s2.displayStudentDetails();
		s2=null;
	}
}
