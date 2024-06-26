package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrderTest {
	@Test
	public void order() throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Steve");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Harris");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
	String confirmationMessage=	driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
	System.out.println(confirmationMessage);
	Thread.sleep(1000);
	driver.quit();
	}

	
	}


