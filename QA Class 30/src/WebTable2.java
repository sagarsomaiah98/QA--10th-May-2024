import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(5000);
	
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int rowSize=rows.size();
		System.out.println("total no of rows -> "+rows.size());
		
		
		String header1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[1]")).getText();
		String header2=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[2]")).getText();
		String header3=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[3]")).getText();
		System.out.println(header1+" |"+header2+"| "+header3);
		
		for(int i=2;i<=rowSize;i++) {
			
			
		String c1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]")).getText();
		String c2=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[2]")).getText();
		String c3=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]")).getText();
		
		System.out.println(c1+"|   "+c2+"   |"+c3);
		}	
   
		driver.quit();
	}

}
