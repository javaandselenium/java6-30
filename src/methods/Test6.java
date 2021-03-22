package methods;

public class Test6 {

	public void add(int a) {
System.out.println(a);
	}

	public void add(int a,int b) {
System.out.println(a+b);
	}

	public void add(int a,double b,int c) {
System.out.println(a+b+c);
	}

	public void add(int c,int a,double b,int d) {
System.out.println(c+a+b+d);
	}

	public static void main(String[] args) {
	Test6 t=new Test6();
	t.add(10,20.0,30);
	t.add(20,30);

	}

}
