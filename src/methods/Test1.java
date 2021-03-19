package methods;

public class Test1 {
	public static void sub() {
		int a=10;
		int b=30;
		int d=a+b;
		System.out.println(d);
	}
	
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		add(10, 30);
		sub();

	}

}
