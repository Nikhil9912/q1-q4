package bank;

public class BOI extends Bank1 {
	public BOI(String bankName, double rateOfInterest) {
		super(bankName, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	private static BOI single_instance = null;
	
	public static BOI getInstance() {
		if(single_instance == null) {
			single_instance = new BOI("BOI",4.0);
		}
		return single_instance;
	}
	

}
