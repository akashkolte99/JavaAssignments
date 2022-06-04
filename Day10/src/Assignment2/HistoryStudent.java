package Assignment2;

public class HistoryStudent extends Student{

	
	int historyMarks;
	int civicsMarks;
	public HistoryStudent(String n, String a , int h ,int c) {
		super(n, a);
		this.historyMarks=h;
		this.civicsMarks=c;
	}
	@Override
	public double getPercentage() {
	
		int total = this.civicsMarks+this.civicsMarks;
		System.out.println(total);
		double per  = Math.round((total/200.0)*100.0);
	
		return per;
	}
}
