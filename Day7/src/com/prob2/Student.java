package com.prob2;

public class Student {

	int studId; 
	String studName;
    double examFee;
    
   public Student() {
	   
   }
    public Student(int i, String string, double d) {
	    this.studId=i;
    	this.studName=string;
    	this.examFee=d;
	}
	
     public void displayDetails() {
    	 System.out.println("Id :"+this.studId);
    	 System.out.println("Student Name:"+this.studName);
    	 System.out.println("Exam Fee :"+this.examFee);
     }
     
    public void payFee(double x,double y) {
	   
//	   System.out.println(y);
	   if(x>y) {
		  System.out.println("No Fees Remaining");
	   }else {
		   double z = y-x;
		  System.out.println("Remaining Fees :"+z);
	   }
   }
}
