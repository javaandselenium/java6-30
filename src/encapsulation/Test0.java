package encapsulation;

public class Test0 {
	
	private String emailAddress="test@gmail.com";
	
	private int password=12345;
	
	private String name="John";
	private int age=90;
	private double salary=90.7899;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
