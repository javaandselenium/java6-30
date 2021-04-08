package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test7 {

	public static void main(String[] args) {
	ArrayList a=new ArrayList<>();
	a.add(30);
	a.add(90);
	a.add(40);
	a.add(80);
	System.out.println("before shuffleing");
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	Collections.shuffle(a);
	System.out.println("after shuffleing");
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	}

}
