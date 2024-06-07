package Parameters;

public class CalculateInterest {
	
	
	public void simpleInterest(double principal, double interest, int time) {
		
		double simpleinterest =(principal*time*interest)/100;
		
		System.out.println("Simple Interest ==>"+simpleinterest);
		
		
	}

	public static void main(String[] args) {
		
	CalculateInterest cal= new CalculateInterest();
	
	cal.simpleInterest(1204.56, 5.2, 3);
	cal.simpleInterest(2343.23, 3.2, 2);
	cal.simpleInterest(190.67, 6.0, 5);
		

	}

}
