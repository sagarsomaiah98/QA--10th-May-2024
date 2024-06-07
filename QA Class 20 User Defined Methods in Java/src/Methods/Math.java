package Methods;

public class Math {
	
	//Access Modifier  returnType Method/Function name
	public void Add()
	{
	//code for addition
	int a =20;
	int b=30;
	int c=a+b;
	System.out.println("Addition of two numbers "+a +" and "+b+" is "+c);
	}
	
	public void Subtract()
	{
		//code for subtraction
	int k =50;
	int p=30;
	int m=k-p;
	System.out.println("Subtraction of two numbers "+k +" and "+p+" is "+m);
	}
	

	public static void main(String[] args) {
		
		//CREATE A OBJECT TO ACCESS METHODS/VARIABLES OUTSIDE MAIN
		//CLASSNAME OBJECTNAME = NEW CLASSNAME()
		
		Math m= new Math();
		m.Add();
		m.Subtract();
		m.Add();
		m.Add();

		
	}

}
