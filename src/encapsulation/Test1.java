package encapsulation;

public class Test1 {

	public static void main(String[] args) {
	Test0 t=new Test0();
	System.out.println(t.getEmailAddress());
	t.setEmailAddress("after updateing "+"abc@gmail.com");
	System.out.println(t.getEmailAddress());
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSalary());
	//System.out.println("after salary updateing");
t.setEmailAddress("after salary updateing"+"67890.00");
System.out.println(t.getSalary());
	}

}
