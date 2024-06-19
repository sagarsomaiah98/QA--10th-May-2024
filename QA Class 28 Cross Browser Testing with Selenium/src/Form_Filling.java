
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling  {
	
	public static int randomID() {
		
		int value=(int) (Math.random()*10000);
		//System.out.println(value);
		
		return value;
	
	}
	
	

	public static void main(String[] args) throws InterruptedException {
	
		String username="John"+randomID();
		System.out.println("username -> "+username);
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("John");
	driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("slave");
	driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("22 tim street");
	driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Newyork");
	driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("NSW");
	driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("1028");
	driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("22222222");
	driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	driver.quit();
     
	




		 
		
		
		
	

	}

}
