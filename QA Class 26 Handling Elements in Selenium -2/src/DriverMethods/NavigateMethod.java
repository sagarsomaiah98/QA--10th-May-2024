package DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {

	public static void main(String[] args) {
		
		WebDriver d= new ChromeDriver();
		//WebDriver d=new FirefoxDriver();
		d.manage().window().maximize(); //maximize the window
		//d.get("https://www.saucedemo.com");
		d.navigate().to("https://www.google.com");
		d.navigate().to("https:///www.seleniumhq.org");
		d.navigate().to("https://www.bing.com");
		
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		

	}

}
