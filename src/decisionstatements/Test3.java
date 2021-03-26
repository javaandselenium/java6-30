package decisionstatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time");
	     int time = s.nextInt();
	     
	     if(time<10) {
	    	 System.out.println("Gm");
	     }
	     else if(time<20) {
	    	 System.out.println("Good noon");
	     }
	     else {
	    	 System.out.println("Good evening");
	     }
		
		
	}

}
