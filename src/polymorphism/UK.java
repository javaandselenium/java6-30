package polymorphism;

public class UK extends Flag{
	public void color() {
		System.out.println("green from UK");
	}
	
	public static void main(String[] args) {
		Flag f=new UK();
		f.color();
	}

}
