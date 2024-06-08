package Static_KeyWords;

public class Employee {
	
	static String name="Charles";
	static char grade='E';
	
	public static void info() {
	
		System.out.println("info method");
		
	}
	
	public static void add() {
		
		
	}

	public static void main(String[] args) {
		
		//Employee e = new Employee();
		
		System.out.println(name);
		System.out.println(grade);
		info();

	}

}
