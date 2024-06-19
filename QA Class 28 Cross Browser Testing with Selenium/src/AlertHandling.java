
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		String alertMsg= al.getText();
		//al.accept(); //click ok
		al.dismiss();//click cancel
		System.out.println(alertMsg);
		
	}

}
