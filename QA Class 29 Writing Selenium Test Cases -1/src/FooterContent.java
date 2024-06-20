import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FooterContent {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/support/demos");
		
		WebElement footer_Content=driver.findElement(By.xpath("//footer[@class='TK-Footer']"));
		
		List<WebElement> links=footer_Content.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
	System.out.println(links.get(i).getText());
		}
		
	
	}}
