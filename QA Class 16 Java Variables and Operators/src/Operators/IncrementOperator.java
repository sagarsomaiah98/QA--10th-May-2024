package Operators;

public class IncrementOperator {

	public static void main(String[] args) {
	int a=2;
	
	a++;//increment the value by 1
	System.out.println(a);
	a++;
	System.out.println(a);
	a++;
	System.out.println(a);
	a=a+1;
	System.out.println(a);
	a=a+2;
	//a+++; this is not allowed, you dont have shortcut for increment other than 1
	System.out.println(a);

	}

}
