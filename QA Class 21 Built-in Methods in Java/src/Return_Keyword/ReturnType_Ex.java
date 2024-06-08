package Return_Keyword;

public class ReturnType_Ex {
	
	public double method1() {
		
		String name="Mark";
		int age=23;
		char grade='K';
		boolean flag=true;
		double height=6.2;
		
		return height;
		
	}
	
	
	
	public static void main(String[] args) {
		
		ReturnType_Ex r = new ReturnType_Ex();
		System.out.println(r.method1());
		double out=r.method1();
		System.out.println(out);
		
		

	}

}
