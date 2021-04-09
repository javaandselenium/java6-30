package exceptionHandling;

import java.io.FileInputStream;

public class Test1 {

	public static void main(String[] args) {
		try {
	FileInputStream fis=new FileInputStream("./d");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	System.out.println("hello");

	}

}
