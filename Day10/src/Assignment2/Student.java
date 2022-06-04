package Assignment2;

public abstract  class Student {

	String name;
	String address;
	
	public Student(String n, String a) {
		this.name=n;
		this.address=a;
	}
	
	
	public String getName() {
		return name;
	}
    
	public String getAddress() {
		return address;
	}
	
	public abstract double getPercentage();
}
