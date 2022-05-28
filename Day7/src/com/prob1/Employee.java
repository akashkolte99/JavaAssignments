package com.prob1;

public class Employee  extends Member{
	 String Specialisation;
	 String Department ;
	 
   

	public Employee() {
		
	}
	public void field (String special , String dept) {
    	 this.Specialisation=special;
		 this.Department=dept;
	 }
	
	public void print(){
	
	System.out.println(this.Specialisation);
		System.out.println(this.Department);
		}
     public static void main(String[] args) {
    	 Employee m1=new Employee();
    	 m1.setdetails("Akash", 20, "9860409842", "Maharashatra", 85000.0);
//    	m1.print();
	}
}
