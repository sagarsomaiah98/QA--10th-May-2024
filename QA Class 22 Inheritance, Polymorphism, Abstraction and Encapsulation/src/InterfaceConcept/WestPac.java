package InterfaceConcept;

public class WestPac implements CentralBank {

	public static void main(String[] args) {
		WestPac w = new WestPac();
		w.savings();
		w.loan();
		w.creditcard();
		w.insurance();

	}

	@Override
	public void savings() {
		System.out.println("westpac savings interest is 4.0%");
		
	}

	@Override
	public void insurance() {
		System.out.println("westpac charges 100$ for insurance");
		
	}

	@Override
	public void loan() {
	System.out.println("westpac loan interest rate is 4.0%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("Westpac charged 100$ for credit card");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
