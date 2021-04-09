package exceptionHandling;

public class Test5 {

	public void add() {
		System.out.println("close db connecttions");
	}

	public static void main(String[] args) {
		try {
		int a=1/0;
		}
		catch(Exception e) {
			System.out.println("handled");
		}
		finally {
			Test4 t=new Test4();
			t.add();
		}

}
}