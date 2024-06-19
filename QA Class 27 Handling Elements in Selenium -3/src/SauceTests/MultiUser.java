package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUser {
	
	public void loginTest(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(username+ " ->Login Test Passed");
		}
		
		catch(Exception e) {
		//	String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
		//	System.out.println(error);
			System.out.println(username+ "->Login Test Failed");
		}
		driver.quit();
		

	
	}
	
	

	public static void main(String[] args) {
	MultiUser mult= new MultiUser();
	mult.loginTest("standard_user","secret_sauce");
	mult.loginTest("locked_out_user","secret_sauce");
	mult.loginTest("problem_user","secret_sauce");
	mult.loginTest("performance_glitch_user","secret_sauce");
	mult.loginTest("error_user","secret_sauce");
	mult.loginTest("visual_user","secret_sauce");

	}

}
