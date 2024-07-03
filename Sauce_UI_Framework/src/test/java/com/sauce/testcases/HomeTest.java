package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.util.TestUtil;

public class HomeTest extends TestBase{
	
	@BeforeMethod
	public void init() throws IOException {
		intialization();
	}
	
	@Test
	public void addtocart() throws IOException {
		LoginPage log= new LoginPage();
		log.login("standard_user", "secret_sauce");
		
		HomePage home=new HomePage();
		home.addItemsToCart();
		TestUtil.Screenshot();
	}
	
	@Test
	public void removeFromCart() throws InterruptedException, IOException {
		LoginPage log= new LoginPage();
		log.login("standard_user", "secret_sauce");
		
		HomePage home=new HomePage();
		home.removeItemsFromCart();
		TestUtil.Screenshot();
		
		
		
	}
	
	@Test
	public void filter() throws IOException {
		LoginPage log= new LoginPage();
		log.login("standard_user", "secret_sauce");
		HomePage home=new HomePage();
		home.filterSelection(1);
		
		TestUtil.Screenshot();
		
		
	}
	

	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
