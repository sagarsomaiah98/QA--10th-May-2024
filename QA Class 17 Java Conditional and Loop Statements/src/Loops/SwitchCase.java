package Loops;

public class SwitchCase {

	public static void main(String[] args) {
	
		char grade='E';
		
		switch(grade) 
		{
		case 'A':
			System.out.println("Good");
			break;
		case 'B':
			System.out.println("Better");
			break;
		case 'C':
			System.out.println("Needs improve");
			break;
		case 'D':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid Grade");
		
		}

	}

}
