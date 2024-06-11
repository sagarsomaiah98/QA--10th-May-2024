package InheritanceConcept;

public class Child extends Parent{
	
	public void car() {
		
		System.out.println("car is owned by child");
	}
	


	public static void main(String[] args) {
		Child c = new Child();
		c.car();
		c.factory();
		c.house();
		System.out.println(c.pension);
		System.out.println(c.grade);
		
	}

}
