package accessSpecifiers;

public class Test3 {
	int a=10;
	
	void sub() {
		System.out.println("default method");
	}
	
	Test3(){
		System.out.println("default constructor");
	}
	
	
	public static void main(String[] args) {
		Test3 t3=new Test3();
		System.out.println("default varabile "+t3.a);
		t3.sub();
	}

}
