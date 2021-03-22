package methods;

public class Test7 {

	public static void send(int numb) {
System.out.println(numb);
	}

	public static void send(int numb,String msg) {
System.out.println(numb+" "+msg);
	}

	public static void send(String msg,double value) {
System.out.println(msg+" "+value);
	}

	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(int a,double b) {
		System.out.println(a+b);
	}
	
	public static void main(String a,double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Test7.send(1234,"hello ge");
		Test7.send(7890);
		Test7.main(10,70.00);

	}

}
