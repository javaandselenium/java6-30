package ac;

import accessSpecifiers.Test0;
import accessSpecifiers.Test2;
import accessSpecifiers.Test3;
import accessSpecifiers.Test4;

public class Demo extends Test4{

	public static void main(String[] args) {
		Test0 t=new Test0();
		System.out.println("public varabile "+t.a);
		t.add();
		
		Demo t4=new Demo();
		System.out.println("protected varaible "+t4.a);
		t4.mul();
	
	}

}
