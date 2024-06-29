package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class LoginTest extends TestBase {
	
	@BeforeMethod
	public void init() throws IOException {
		intialization();
	}
	
	
	@Test
	public void validLogin() throws IOException {
		
		
		LoginPage log= new LoginPage();
		log.login("standard_user", "secret_sauce");
		
	
	}
	
	@Test
	public void invalidLogin() throws IOException {
		
		
		LoginPage log= new LoginPage();
		log.login("username1", "secret_sauce");
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
