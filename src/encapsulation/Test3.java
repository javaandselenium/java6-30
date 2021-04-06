package encapsulation;

public class Test3 {

	public static void main(String[] args) {
		Test2 t=new Test2();
		System.out.println(t.getAge());
		System.out.println(t.getName());
		
System.out.println(t.getSal());
t.setSal(123456);
System.out.println(t.getSal());
t.setSal(908900);
System.out.println(t.getSal());

	}

}
