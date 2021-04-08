package collections;

import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(100);
		t.add(20);
		t.add(300);
		t.add(1);
		t.add(100);
		
		System.out.println(t);

	}

}
