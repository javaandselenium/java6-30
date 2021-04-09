package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		try {
	int i=1/0;
		}
		catch(ArithmeticException ae){
	System.out.println(ae);
		}
	int a[]=new int[3];
	a[0]=10;
	a[1]=30;
	a[2]=30;
	try {
	a[3]=90;
	}
	catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println(a1);
	}
	System.out.println("hello");
	}

}
