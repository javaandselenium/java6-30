package methods;

public class Test5 {
	int b=100;
	static int a=900;
	
	public static void demo() {
		System.out.println("demo");
	}
	
	public void sample() {
		System.out.println("sample");
	}

	public static void main(String[] args) {
		System.out.println(Test5.a);
		Test5.demo();
		
		Test5 t=new Test5();
		System.out.println(t.b);
		t.sample();

	}

}
