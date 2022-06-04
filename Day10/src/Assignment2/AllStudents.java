package Assignment2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ScienceStudent Name :");
		String name1 = sc.next();
		System.out.println("Enter ScienceStudent Address :");
		String add1 = sc.next();
		System.out.println("Enter Marks Obtained in Physics : ");
		int p = sc.nextInt();
		System.out.println("Enter Marks Obtained in Chemistry : ");
		int c = sc.nextInt();
		System.out.println("Enter Marks Obtained in Maths : ");
		int m = sc.nextInt();
		System.out.println("***************************");
		System.out.println("Enter HistoryStudent Name :");
		String name2 = sc.next();
		System.out.println("Enter HistoryStudent Address :");
		String add2 = sc.next();
		System.out.println("Enter Marks Obtained in History : ");
		int h = sc.nextInt();
		System.out.println("Enter Marks Obtained in Civcs : ");
		int hc = sc.nextInt();
		
		Student s1 = new ScienceStudent(name1,add1,p,c,m);
		double per1 =s1.getPercentage();
		
		System.out.println("====================");
		System.out.println("Name : "+ s1.getName());
		System.out.println("Address : "+s1.getAddress());
		System.out.println("Marks Obtained In Science is " + per1 +"%");
		
		Student s2 = new HistoryStudent(name2,add2,h,hc);
//		HistoryStudent h2 = (HistoryStudent)s2;
//		h2.
		double per2=s2.getPercentage();
		
		System.out.println("====================");
		System.out.println("Name : "+ s2.getName());
		System.out.println("Address : "+s2.getAddress());
		System.out.println("Marks Obtained In Histroy is " + per2 +"%");
		
	}
}
