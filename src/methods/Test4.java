package methods;

public class Test4 {
	static int a=20;
	int b=30;
	
	public void add() {
		System.out.println("adding");
	}
	
	public static void sub() {
		System.out.println("subtracting");
	}

	public static void main(String[] args) {
		System.out.println(Test4.a);
		Test4.sub();
		
		Test4 t=new Test4();
		System.out.println(t.b);

		t.add();
	}

}
