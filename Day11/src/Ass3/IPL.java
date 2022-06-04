package Ass3;

import java.util.Scanner;

public class IPL {

	 public void homeTeamStadium(Stadium stadium) {
		 
		 switch(stadium) {
		 case EDEN_GARDENS_STADIUM : 
			 stadium.ground();
		   break;
		 case WANKHEDE_STADIUM : 
			 stadium.ground();
		     break;
		 case CHIDAMBARAM_STADIUM : 
			 stadium.ground();
		     break;
		 case M_CHINNASWAMY_STADIUM: 
			 stadium.ground();
		     break;
		
		 
		 }
	 }
	 
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Stadium Name In Capital Letter : ");
		 String name = sc.next();
		 
		 try {
		 Stadium S = Stadium.valueOf(name);
		 
		 IPL ipl = new IPL();
		 
		 ipl.homeTeamStadium(S);
		 }
		 catch (Exception e){
			 System.out.println("Enter Valid Name");
		 }
	}
}
