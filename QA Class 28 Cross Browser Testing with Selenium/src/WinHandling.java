

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		
		Iterator<String> it = windows.iterator();
		String firstWin= it.next();
		String secWin=it.next();
		
		driver.switchTo().window(secWin);
		
		driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
	
	
	
		
	
	}

}
