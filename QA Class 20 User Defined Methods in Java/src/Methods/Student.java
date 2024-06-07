package Methods;

public class Student {
	
	
	public void display() {
		String name="Henry";
		int age=15;
		double height= 4.5;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	


	public static void main(String[] args) {
	
		
		Student stud=new Student();
		stud.display();
		
	}

}
