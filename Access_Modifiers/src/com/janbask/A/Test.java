package com.janbask.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Private_Example p= new Private_Example();
		
		/*
		 * System.out.println(p.age); System.out.println(p.name); p.method1();
		 */
		
	//	Default_Example d = new Default_Example();
	//	System.out.println(d.age);
	//	System.out.println(d.name);
	//	d.method1();
	
		
		Protected_Example pr= new Protected_Example();
		System.out.println(pr.age);
		System.out.println(pr.name);
		pr.method1();

	}

}
