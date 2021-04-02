package accessSpecifiers;

public class Test1 {

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println("public varabile "+t.a);
		t.add();
		
		Test3 t3=new Test3();
		System.out.println("default varabile "+t3.a);
		t3.sub();
		
		Test4 t4=new Test4();
		System.out.println("protected varaible "+t4.a);
		t4.mul();
		
		
	}

}
