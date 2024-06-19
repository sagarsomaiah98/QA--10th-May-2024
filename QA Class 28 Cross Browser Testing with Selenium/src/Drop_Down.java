
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement dropDowns=driver.findElement(By.xpath("//select[@id='course']"));
		
		Select sel= new Select(dropDowns);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("python");
		Thread.sleep(1000);
		sel.selectByVisibleText("Dot Net");

		 

	}

}
