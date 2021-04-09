package exceptionHandling;

public class Test3 {

	public static void main(String[] args) {
		try {
			int i=1/0;
				}
				catch(ArithmeticException ae){
			System.out.println(ae);
				}
		
		catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println(aib);
		}
	}

}
