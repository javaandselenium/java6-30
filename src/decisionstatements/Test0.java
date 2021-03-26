package decisionstatements;

import java.util.Scanner;

public class Test0 {

	public static void main(String[] args) {
		//int amt=2000;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the amt");
		int amt=s.nextInt();
		
		if(amt>=100) {
			System.out.println("withdraw");
		}

		System.out.println("hello java");
	}

}
