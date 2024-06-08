package Variables;

public class Local_Variable {

	
public void info()
{
	//local variables- variables defined inside the method can be accessed only inside the method cannot access outside the method
	String name="Jack";
	int age =18;
		
		System.out.println("info method");
		System.out.println(name);
		System.out.println(age);
		
	
	}
	public void display() {
		String name="Kevin";
		int age =30;
		System.out.println("display method");
		System.out.println(age);
		System.out.println(name);
		
	
	}
	public static void main(String[] args) {
	
		
		Local_Variable l= new Local_Variable();
		l.info();
		l.display();
		
		
		
	}

}
