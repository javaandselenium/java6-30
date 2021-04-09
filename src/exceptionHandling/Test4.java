package exceptionHandling;

public class Test4 {
	public void add() {
		System.out.println("close db connecttions");
	}

	public static void main(String[] args) {
		try {
		int a=1/0;
		}
		finally {
			Test4 t=new Test4();
			t.add();
		}
		
		

	}

}
