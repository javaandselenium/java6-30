package exceptionHandling;

public class Test0 {
	
	public static void demo() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(ArithmeticException a) {
	System.out.println(a+"handled");	
		}
	System.out.println("hello");
    demo();
	}

}
