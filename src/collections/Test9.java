package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(30);
		a.add(90);
		a.add(40);
		a.add(80);
		
		System.out.println("before sorting "+a);
		Collections.sort(a);
		System.out.println("after sorting "+a);

	}

}
