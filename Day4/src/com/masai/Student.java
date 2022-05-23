package com.masai;

public class Student {

	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	public int getroll() {
		return roll;
	}
	
	public String getname() {
		return name;
	}
	
	public String getaddress() {
		return address;
		
	}
	
	public String getcollname() {
		return collageName;
	}

	
	public Student (int roll, String name , String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
	public Student(int roll, String name , String address, String collname) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collname;
	}
	
	public static Student  getStudent(boolean isFromNIT) {
	
		if(isFromNIT==true)
		{
			Student s = new Student(45,"Akash","Maharashtra");
			return s;
		}
		else 
		{
			Student s = new Student(44,"Amit","Bihar");
			return s;
		}
		
	}
}

	
	
	
	

