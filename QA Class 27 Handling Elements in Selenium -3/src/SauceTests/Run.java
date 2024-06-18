package SauceTests;

public class Run {

	public static void main(String[] args) {
	LoginTest l= new LoginTest();
	l.login();
	
	AddToCartTest a = new AddToCartTest();
	a.addtocart();
	
	OrderTest o= new OrderTest();
	o.order();
	
	LogoutTest lo= new LogoutTest();
	lo.logout();

	}

}
