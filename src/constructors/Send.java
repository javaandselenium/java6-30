package constructors;

public class Send {
	
	public Send(int a)
	{
		System.out.println(a);
	}
	
	public Send(String name,double b)
	{
		System.out.println(name+" "+b);
	}
	
	public Send(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public Send(String a,int b)
	{
		System.out.println(a+" "+b);
	}
	
	

	public static void main(String[] args) {
		Send s=new Send("hello",67.00);
		Send s1=new Send(10,30);
	}

}
