package Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;;


public class XpathLoc {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com");
driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//input[@id='login-button']")).click();
//driver.close();
driver.quit();



	}

}
