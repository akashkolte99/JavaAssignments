package com.masai;

public class Main {

	public static void main(String [] args) {
		
		Student s = Student.getStudent(true);
			if(s.getcollname()==null) {
				System.out.println("Roll No " + s.getroll());
				System.out.println("Name  " + s.getname());
				System.out.println("Address " + s.getaddress());
			}else {
				System.out.println("Roll No " + s.getroll());
				System.out.println("Name  " + s.getname());
				System.out.println("Address " + s.getaddress());
				System.out.println("Collage Name " + s.getcollname());
			}
		}
		
	
}
