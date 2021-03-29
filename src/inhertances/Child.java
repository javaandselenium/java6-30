package inhertances;

public class Child extends Parent{
	
	public void cycle() {
		System.out.println("cycle");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.cycle();
		c.car();
		c.house();

	}

}
