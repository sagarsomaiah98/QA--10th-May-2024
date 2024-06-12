package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Eg {

	public static void main(String[] args) {
		
		Set<String> colors= new HashSet<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Black");
		System.out.println(colors.size());
		colors.add("Red");//duplicate
		//colors.add("black");
		System.out.println(colors.size());
		
		Iterator<String> it= colors.iterator();// create a iterator and attach itself to the colors set
		/*
		 * System.out.println(it.next());//it will give the value its pointed to and
		 * then moves to next one System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		System.out.println("********************************");
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
}

}