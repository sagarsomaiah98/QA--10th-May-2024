package Variables;

public class GlobalVariables {
	//global variables- 
	String name="peter";
	int age =30;
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		
	}
	public static void main(String[] args) {
	
    GlobalVariables g= new GlobalVariables();
    System.out.println(g.name);
    System.out.println(g.age);
    
    g.display();
	}

}
