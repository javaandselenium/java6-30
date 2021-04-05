package abstaraction;

public class AtmMachine implements Atm{

	@Override
	public void cardSlot() {
	System.out.println("insert the card");
		
	}

	@Override
	public void pinNumb() {
		System.out.println("eneter the pin");
		
	}

	@Override
	public void cash() {
		System.out.println("withdraw the cash");
	}
	
	public static void main(String[] args) {
		AtmMachine a=new AtmMachine();
		a.cardSlot();
		a.pinNumb();
		a.cash();
	}

}
