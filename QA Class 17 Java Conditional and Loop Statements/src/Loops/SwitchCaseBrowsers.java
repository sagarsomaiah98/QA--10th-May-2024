package Loops;

public class SwitchCaseBrowsers {

	public static void main(String[] args) {
	
		String browser="CHROME";
		
		switch(browser)
		{
		case "FIREFOX":
			System.out.println("Launching FIREFOX browser");
			System.out.println("Navigate to the url in firefox");
		break;
		case "SAFARI":
			System.out.println("Launching SAFARI browser");
			System.out.println("Navigate to the url in SAFARI");
		break;
		case "CHROME":
			System.out.println("Launching CHROME browser");		
		break;
		case "EDGE":
			System.out.println("Launching EDGE browser");
			System.out.println("Navigate to the url in EDGE");
		break;
		default:
			System.out.println("Invalid Browser");
		
		
		}

	}

}
