package accessSpecifiers;

public class Test0 {
	public int a=10;
	
	public void add() {
		System.out.println("public method");
	}
	
	public Test0() {
		System.out.println("public constructor");
	}

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println("public varabile "+t.a);
	t.add();
	
	Test3 t3=new Test3();
	System.out.println("default varabile "+t3.a);
	t3.sub();

	}

}
