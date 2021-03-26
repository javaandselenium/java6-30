package decisionstatements;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the marks");
	int marks=s.nextInt();
	
	if(marks<50) {
		System.out.println("Fail");
	}
	else if(marks>=50 && marks<60) {
		System.out.println("C grade");
	}
	else if(marks>=60 && marks<75) {
		System.out.println("B grade");
	}
	else if(marks>=75 && marks<85) {
		System.out.println("A grade");
	}
	else if(marks>=85 && marks>90) {
		System.out.println("A+ grade");
	}
	else
	{
		System.out.println("invalid marks");
	}
	}

}
