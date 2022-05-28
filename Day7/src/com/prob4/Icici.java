package com.prob4;

public class Icici extends Bank{

	double rateOfintrest;
	@Override
	public void displayDetails() {
	
		Icici i = new Icici();
		i.branchName="Icici";
		System.out.println(i.branchName);
		i.IfscCode="icici007";
		System.out.println(i.IfscCode);

		i.rateOfintrest=8.0;
		System.out.println(i.rateOfintrest);	
	}
}
