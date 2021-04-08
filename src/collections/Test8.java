package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add(30);
		a.add(90);
		a.add(40);
		a.add(80);
		System.out.println("before swapping");
		System.out.println(a);
		Collections.swap(a,0, a.size()-1);
		System.out.println(a +"after swapping");

	}

}
