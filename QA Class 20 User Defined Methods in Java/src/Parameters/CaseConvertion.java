package Parameters;

public class CaseConvertion {
	
	public void lowerCase(String input) {
		
		System.out.println("After Converting to lowercase "+input.toLowerCase());
		
	}

	public static void main(String[] args) {
		

		CaseConvertion c= new CaseConvertion();
		c.lowerCase("KEVIN Francis");

	}

}
