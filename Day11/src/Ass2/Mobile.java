package Ass2;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};

	public boolean searchOutdatedModel(String mobile) {
		
		for(int i=0;i<this.outdatedModels.length;i++) {
			if(mobile.equals(outdatedModels[i])) {
//				System.out.println(this.outdatedModels[i]);
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Mobile Model");
		String x = sc.next();
		
		Mobile m = new Mobile();
		
		boolean b = m.searchOutdatedModel(x);
		
		if(b) {
			System.out.println(x+"_OUTDATED");
		}else {
			System.out.println(x+"is not OUTDATED");
		}
	}
}


