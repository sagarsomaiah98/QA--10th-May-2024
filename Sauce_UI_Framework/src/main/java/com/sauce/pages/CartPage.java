package com.sauce.pages;

import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.TestBase;

public class CartPage extends TestBase {
	
	
	public CartPage() {
		
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
