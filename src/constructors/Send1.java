package constructors;

public class Send1 {
	public Send1(int a)
	{
		System.out.println(a);
	}
	
	public Send1(String name,double b)
	{
		this(30);
		System.out.println(name+" "+b);
	}
	
	public Send1(int a,int b)
	{
		this("Hello",90.00);
		System.out.println(a+b);
	}
	
	public Send1(String a,int b)
	{
		this(10,50);
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		Send1 s=new Send1("hi",9);

	}

}
