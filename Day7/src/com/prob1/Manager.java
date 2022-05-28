package com.prob1;

public class Manager extends Member{

	 String Specialisation;
	 String Department ;
	 

	 void Manager() {
		 
	 }
	public  void field (String special ,String dept) {
		 this.Specialisation=special;
		 this.Department=dept;
	 }
       
     public void print(){
 	
 		System.out.println(this.Specialisation);
 		System.out.println(this.Department);
 	
 	}
   
}
