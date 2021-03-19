package methods;

public class Test2 {
	
	static int amount=1000;
	static int wamt=500;
	
	public static void withdrawl() {
		int balance=amount-wamt;
		System.out.println(balance);
	}

	public static void main(String[] args) {
		withdrawl();

	}

}
