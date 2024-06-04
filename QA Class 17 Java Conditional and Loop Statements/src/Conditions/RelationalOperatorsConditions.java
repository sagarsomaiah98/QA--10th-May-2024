package Conditions;

public class RelationalOperatorsConditions {

	public static void main(String[] args) {
		int age = 18;

        // Check if age is equal to 18
        if (age == 18) { //true
            System.out.println("You are 18 years old.");
        }

        // Check if age is not equal to 18
        if (age != 18)  //false
            System.out.println("You are not 18 years old.");
            else 
            	System.out.println("you are 18 years old");
            
        

        // Check if age is greater than 18
        if (age > 18) { //false
            System.out.println("You are older than 18.");
        }

        // Check if age is less than 18
        if (age < 18) { //false
            System.out.println("You are younger than 18.");
        }

        // Check if age is greater than or equal to 18
        if (age >= 18) { //true
            System.out.println("You are 18 or older.");
        }

        // Check if age is less than or equal to 18
        if (age <= 18) { //true
            System.out.println("You are 18 or younger.");
        }
    }
}