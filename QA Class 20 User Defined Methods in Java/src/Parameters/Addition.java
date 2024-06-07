package Parameters;

public class Addition {
	
	//method with parameters/arguments
	
	
	public void add(int a, int b) {
		
		
		int c=a+b;
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}


	public static void main(String[] args) {
	
		Addition a= new Addition();
		a.add(10,30);
		a.add(5,7);
		a.add(8,19);
		a.add(56,120);
		a.add(88,90);


	}

}
