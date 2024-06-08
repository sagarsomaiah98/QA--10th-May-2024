package Return_Keyword;

public class Addition {
	
	
	public int add() {
		
		int a =30;
		
		int b=80;
		
		int c=a+b;
		
		//System.out.println(c);
		
		return c;
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		Addition a= new Addition();
		
		System.out.println(a.add());
		if(a.add()%2==0)
			System.out.println("is even");
		else
			System.out.println("is odd");
		
		
		
	}

}
