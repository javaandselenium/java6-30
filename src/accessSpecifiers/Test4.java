package accessSpecifiers;

public class Test4 {
	protected int a=900;
	
	protected void mul() {
		System.out.println("protected method");
	}
	
	protected Test4() {
		System.out.println("protected constructor");
	}
	

	public static void main(String[] args) {
		Test4 t4=new Test4();
		System.out.println("protected varaible "+t4.a);
		t4.mul();

	}

}
