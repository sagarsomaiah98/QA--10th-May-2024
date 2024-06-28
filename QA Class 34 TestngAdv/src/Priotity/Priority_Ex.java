package Priotity;

import org.testng.annotations.Test;

public class Priority_Ex {
	@Test(priority=1)
	public void login() {
		
		System.out.println("calling login");
	}


	@Test(priority=-2)
	public void transactions(){
		
		System.out.println("calling transactions");
	}
	@Test(priority=5)
	public void setup() {
		
		System.out.println("calling setup");
	}
	@Test(priority=4)
	public void order() {
		
		System.out.println("calling order");
	}
	@Test(priority=5)
	public void profile() {
		
		System.out.println("calling profile");
	}
	@Test(priority=3)
	public void addtocart() {
		
		System.out.println("calling addtocart");
	}
	
}
