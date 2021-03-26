package decisionstatements;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the grade");
		int grade = s.nextInt();
		
		switch(grade) {
		case 1:System.out.println("A+ grade");
		break;
		case 2:System.out.println("A grade");
		break;
		case 3:System.out.println("B grade");
		break;
		case 4:System.out.println("C grade");
		break;
		case 5:System.out.println("D grade");
		break;
		default:System.out.println("fail");
		
		
		}

	}

}
