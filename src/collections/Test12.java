package collections;

import java.util.ArrayList;

public class Test12 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(30);
		a.add(90);
		a.add(40);
		a.add(80);
		
		for(Object ele:a) {
			System.out.println(ele);
		}
	}

}
