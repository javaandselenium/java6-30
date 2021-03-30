package methods;

public class Test9 extends Test8 {
	
	public void status() {
		System.out.println("Photo and videos");
		super.status();
	}
	
	public static void main(String[] args) {
		Test9 t=new Test9();
		t.status();
	}

}
