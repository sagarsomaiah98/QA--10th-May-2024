package AbstractionConcept;

public class Citi extends Bank{

	public static void main(String[] args) {
		
		Citi c = new Citi();
		c.creditcard();
		c.insurance();
		c.locker();

	}

	@Override
	public void locker() {
		System.out.println("citi provides locker at 50$");
		
	}

	

}
