package TrycatchExample;;

public class Try_Catch {

	public static void main(String[] args) {
		         
		
		int[] a= new int [10];
	try {	
		a[3]=10;
		a[2]=20;
		a[10]=30;
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
	catch(Exception e1) {
	
		System.out.println("cannot store values to array");	
		e1.printStackTrace();
		
	}	
		
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println("continue with program");
		System.out.println("end of the program");
		
		String stud[]= new String[5];
		System.out.println(stud[2]);
		
		
		
		
		
	}
}
