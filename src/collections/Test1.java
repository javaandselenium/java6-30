package collections;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector c=new Vector();
		c.add('A');
		c.add('A');
		c.add("hello");
		c.add(20);
		c.add(10);
		c.add(10);
		c.add('A');
		c.add("hello");
		c.add(20);
		c.add(10);
		c.add(90);
		System.out.println("current data in the vector "+c.size());
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
System.out.println("capacity of the vector is "+c.capacity());
	}

}
