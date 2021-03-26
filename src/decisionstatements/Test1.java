package decisionstatements;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//int amt=200;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amt");
		int amt = s.nextInt();
		if(amt>=500) {
			System.out.println("withdraw");
		}
		else
		{
			System.out.println("we cannot withdraw");
		}

	}

}
