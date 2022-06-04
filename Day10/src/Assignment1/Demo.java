package Assignment1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		if(amount >1000) {
			return new TajHotel();
		}
		else if(amount>200&&amount<1000) {
			return new RoadSideHotel();
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Amount You Have : ");
		int x = sc.nextInt();
		
		Demo d1 = new Demo();
		Hotel h = d1.provideFood(x);
		
		if(h instanceof TajHotel) {
			h.chickenBiryani();
            h.masalaDosa();
            
            TajHotel t =(TajHotel)h;
             t.welcomeDrink();
		}else if( h instanceof RoadSideHotel) {
			h.chickenBiryani();
			h.masalaDosa();
		}else {
			System.out.println("You need more Money");
		}
	}
}


//write the logic if the supplied amount is more than 1000
//then return the object of TajHotel class
//if the supplied amount is greater than 200 and less than 1000
//then return the object of RoadSideHotel class
