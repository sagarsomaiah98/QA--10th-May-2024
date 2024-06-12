package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class AL {

	public static void main(String[] args) {
		
		
		List<String> names= new ArrayList<>();
		names.add("Henry");
		names.add("Peter");
		names.add("Leo");
		
		System.out.println(names.size());
		
		names.add("Mark");
		names.add("Alice");
		names.add("Nisha");
		//names.add("Leo"); duplicates are allowed
		
		System.out.println(names.size());
		
	//	System.out.println(names.get(6));
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			
		}
		
		
		
		
		
	}

}
