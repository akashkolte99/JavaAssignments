package com.prob2;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student(22,"Akash",44500.00);
		
		s1.displayDetails();
		
		DayScholler ds=new DayScholler();
		ds.payFee(4000.0, 42500.0);
		System.out.println("======================");
		
        Student s2 = new Student(22,"Akash",44500.00);
		
		s2.displayDetails();
		
		Hosteller hs=new Hosteller();
		
		hs.payFee(45000.0,42500.0);
		
	}
}
