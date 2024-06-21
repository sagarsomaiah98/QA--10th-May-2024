import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(5000);
	
		driver.manage().window().maximize();
		String header1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[1]")).getText();
		String header2=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]")).getText();
		String header3=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[3]")).getText();
		System.out.println(header1+" |"+header2+"| "+header3);
		
		for(int i=2;i<=7;i++) {
			String first="//table[@id='customers']/tbody/tr[";
			String second="]/td[1]";
			
		String c1=driver.findElement(By.xpath(first+i+second)).getText();
		
		System.out.println(c1);
		}	
   
	}

}
