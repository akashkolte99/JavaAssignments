package Assignment2;

public class ScienceStudent extends Student{

	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	public ScienceStudent(String n, String a,int p,int c,int m) {
		super(n, a);
		this.mathsMarks=m;
		this.chemistryMarks=c;
		this.phisicsMarks=p;
		
	}
	@Override
	public double getPercentage() {
         int total = this.chemistryMarks+this.phisicsMarks+this.mathsMarks;
		System.out.println(total);
		double per  = Math.round((total/300.0)*100.0);
	
		return per;
	}
	
	
}
