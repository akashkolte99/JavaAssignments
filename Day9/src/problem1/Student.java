package problem1;

import java.util.Scanner;

public class Student {
	public Scanner sc = new Scanner(System.in);
	private int roll;
	private String name;
	private int marks;
	private char grade;
	

	public Student() {
		
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int r) {
		this.roll = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int m) {
		this.marks = m;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char g) {
		this.grade = g;
	}
	

	

	public void displayDetails(Student s) {
		
//		Student s = new Student();
		System.out.println("Enter Roll Number : ");
	    s.setRoll(sc.nextInt());
	    System.out.println("Enter Name :");
	    s.setName(sc.next());
	    System.out.println("Enter Marks");
	    int m = sc.nextInt();
	    s.setMarks(m);
	    
	    char x= s.calculateGrade(m);
	    s.setGrade(x);; 
	   System.out.println( s.toString() );
	    System.out.println("Student Grade is :"+s.getGrade());
	    
	}
	
	private char calculateGrade (int marks) {
		if (marks >= 500) {
	          return  'A';
		}
		if (marks < 500 && marks >= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
		
		
	}

	
	@Override
	public String toString() {
		return "name = "+this.name+"\nroll = "+this.roll+"\nmarks "+ this.marks ;
	}
//	public String toString() {
//		return "name = "+this.name+"\nroll = "+this.roll+"\nmarks "+ this.marks ;
//	}
	
}

//Q1) Create a Student bean class having the following properties
//Instance variables:
//private roll: int
//private String name
//private int marks
//private char grade
//Provide suitable constructors, and following methods:
//public displayDetails(): void
//private calculateGrade(): char
//
//if marks ≥ 500 : Grade is A
//if marks < 500 and ≥ 400 : Grade is B
//if marks <400 : Grade is C
//
//Override the toString() method to print all the details of Student class.
//inside the displayDetails() method, create the Student class object by taking (roll, name,
//marks ) from the user and call the calculateGrade() method to get the Grade of the
//Student.
//
//Create another class Demo in which create two Student objects, and invoke the
//displayDetails(). It should also display the student grade.