package Typecasting;

public class Tea  extends Coffee{
	
	public void coldTea() {
		System.out.println("coldtea");
	}
	
	public void hotTea() {
		System.out.println("hottea");
	}
	
	Tea(){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Coffee c=new Tea();
		c.coldCoffee();
		c.hotCoffee();
		
	}

}
