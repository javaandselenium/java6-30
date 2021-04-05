package abstaraction;

public class Child extends Parent1 implements Parent2,Parent4{

	@Override
	public void cone() {
	System.out.println("cone from parent 4");
	}

	@Override
	public void home() {
	System.out.println("home from parent 2");
		
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.car();
		c.cone();
		c.home();
		
		
		
	}

	
}
