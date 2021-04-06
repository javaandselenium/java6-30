package encapsulation;

public class Test2 {
	
	private String name="Test";
	
	private int age=12;
	
	private double sal=90.90;

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
