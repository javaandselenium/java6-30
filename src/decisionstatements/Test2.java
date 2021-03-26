package decisionstatements;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//int time=20;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the time");
		int time = s.nextInt();
		
		if(time>=6 && time<=11) {
			System.out.println("GM");
		}
		else if(time<=15) {
			System.out.println("Good noon");
		}

		else if(time<=20) {
			System.out.println("Good eveing");
		}
		else if(time<=24)
		{
			System.out.println("Good night");
		}
		else {
			System.out.println("invalid time");
		}
	}

}
