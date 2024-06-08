package Variables;
public class Employee {
    String role="manager";//global variables
	double salary=521.36;//global variables
		
//local variable scope is only inside the function/method
	//local variable cannot be called outside the function/method
	public void emp_info() {		
		int age=30; //local variable
		String name="john";//local variable		
		System.out.println(age);
		System.out.println(name);
		System.out.println(role);
		System.out.println(salary);
		
	}
	
	public void display()
	{
		String role="Admin";
		double salary=900.12;
		System.out.println(this.role);
		System.out.println(salary);
			
	}
	

	public static void main(String[] args) {
		
      Employee e = new Employee();
       e.display();
      
	
		
		

	}

}
