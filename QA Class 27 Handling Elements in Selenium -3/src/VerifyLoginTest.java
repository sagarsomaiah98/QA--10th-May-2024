import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Test Passed");
		}
		
		catch(Exception e) {
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(error);
			System.out.println("Login Test Failed");
		}
		driver.quit();
		

	}

}
