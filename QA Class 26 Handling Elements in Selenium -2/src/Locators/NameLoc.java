package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLoc {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce1");
		driver.findElement(By.name("login-button")).click();
		//driver.close();
		driver.quit();


	}

}
