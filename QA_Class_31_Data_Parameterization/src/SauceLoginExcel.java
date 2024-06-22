import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLoginExcel {

	public static void main(String[] args) throws InterruptedException {
Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA- 10th May 2024\\QA_Class_31_Data_Parameterization\\src\\TestSuite\\SAUCE_LOGIN.xlsx");
		
		int rowsCount=xls.getRowCount("SAUCE");
		System.out.println(rowsCount);
		
		
		for(int i=2;i<=rowsCount;i++) {
		
		String username=xls.getCellData("SAUCE", "USERNAME", i);
		String password=xls.getCellData("SAUCE", "PASSWORD", i);
		
		
		System.out.println(username+" | "+password);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.quit();
		
		}

	}

}
