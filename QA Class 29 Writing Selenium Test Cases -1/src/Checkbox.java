import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
		
		
	
		
		driver.get("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
	

	}

}
