package Typecasting;

public class Paper extends Pen {
	
	public void whitePaper() {
		System.out.println("whitepaper");
	}
	
	public void colorPaper() {
		System.out.println("colorpaper");
	}
	
	public static void main(String[] args) {
		Pen p=new Paper();
		
		Paper p1=(Paper)p;
		p1.bluePen();
		p1.redPen();
		p1.whitePaper();
		p1.colorPaper();
		
	}

}
