package com.masai;

public class JavaBeans {

	int roll;
	String name;
	int age;
	int marks;
	
	void Student1() {
		System.out.println("Roll No: "+ roll);
		System.out.println("Name : "+ name);
		if(age>18 && age<60) {
			System.out.println("age : "+ age);
		}else {
			System.out.println("Age Is Not Valid");
		}
		
		if(marks>0 && marks<500) {
			System.out.println("marks : "+ marks);
		}else {
			System.out.println("Marks Are Invalid  ");
		}
		
	}
	
	void Student2(int roll,String name, int age , int marks) {
		System.out.println("Roll No: "+ roll);
		System.out.println("Name : "+ name);
		
		if(age>18 && age<60) {
			System.out.println("age : "+ age);
		}else {
			System.out.println("Age Is Not Valid");
		}
		
		if(marks>0 && marks<500) {
			System.out.println("marks : "+ marks);
		}else {
			System.out.println("Marks Are Invalid  ");
		}
	}
	public static void main(String[] args) {
	
//		Make validation checks before setting the age and marks of the Student (i.e. are they in
//				the valid range,18<age<60, 0<marks<500).

		//normal ways
		JavaBeans s1 = new JavaBeans() ;
		s1.roll=20;
		s1.name="Akash";
		s1.age=23;
		s1.marks=0;
		
		s1.Student1();
		
		s1=null;
		
		System.out.println("  ");
		
		// 
		JavaBeans s2 = new JavaBeans();
		
		s2.Student2(22, "Mohit", 17, 40);
		
		s2=null;
	}
}
