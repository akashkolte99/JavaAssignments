package com.masai;

public class Prob {

	int funx (int x){
		
		
		 if(x%2==1) {
			int a=-1;
			return a;
		}else if(x<0){
			int a = 0;
			return a;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		Prob p1 = new Prob();
		int a = 54;
		int x = p1.funx(a);
	     if(x==1) {
			int r = a%10;
			int q = 10-r;
			System.out.println(a+q);
		}else if(x==0){
			System.out.println("Error");
		}else {
			System.out.println(a);
		}
	}
}
