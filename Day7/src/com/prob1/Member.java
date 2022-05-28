package com.prob1;

public class Member {

	String name ;
	int age;
	String PhoneNo;
	String address;
	double salary;
	
	public void printSalary () {
		System.out.println("Salary is : " + salary);
	}



	public void setdetails(String name1, int age1, String phoneNo1, String address1, double salary1) {	
		this.name=name1;
		this.age=age1;
		this.PhoneNo=phoneNo1;
		this.address=address1;
		this.salary=salary1;
		
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.PhoneNo);
		System.out.println(this.address);
		System.out.println(this.salary);
	}


	
	
}


