package com.prob1;

public class Main {

	public static void main(String[] args) {
		Employee e1= new Employee();

		e1.field("FrontEnd", "Employee");
		e1.setdetails("Akash", 20, "9860409842", "Maharashatra", 85000.0);
		e1.print();
		e1.printSalary();
		System.out.println("===================");
		Manager m1= new Manager();

		m1.field("FrontEnd", "Manager");
		m1.setdetails("Amit", 20, "9860409842", "Bihar", 87000.0);
		m1.print();

	}
}

//It also has a method named 'printSalary' which prints the salary of the members.
//Create two classes 'Employee' and 'Manager' inherits the 'Member' class.
//The 'Employee' and 'Manager' classes have data members such as. :
//Specialisation : String
//Department : String
//Now, create a Main class which has the main method in it and assign name, age, phone
//number, address and salary to an employee and a manager by making an object of both
//of these classes and print the same.