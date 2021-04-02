package accessSpecifiers;

public class Test2 {
	private int a=100;
	
	private void demo() {
		System.out.println("private method");
	}
	
	private Test2() {
		System.out.println("private constructor");
	}

	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println("private varabile "+t.a);
		t.demo();
		Test3 t3=new Test3();
		System.out.println("default varabile "+t3.a);
		t3.sub();
	
	}
	
	
	
	

}
