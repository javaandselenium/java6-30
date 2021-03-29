package inhertances;

public class AdvaceCal extends BasicCal{
	
	public void costeta() {
		System.out.println("coseteta");
	}
	
	public void sinteta() {
		System.out.println("sinteta");
	}
	
	public static void main(String[] args) {
		AdvaceCal a=new AdvaceCal();
		a.costeta();
		a.sinteta();
		a.add(1,3);
		a.sub(10,5);
		a.mul(90,3);
	}

}
