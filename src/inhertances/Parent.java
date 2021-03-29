package inhertances;

public class Parent extends GrandFather{
	
	public void house() {
		System.out.println("house");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.house();
		p.car();
	}

}
