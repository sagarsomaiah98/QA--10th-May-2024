package ListConcept;

import java.util.LinkedList;
import java.util.List;

public class List_Heterogenus {

	public static void main(String[] args) {
		List<Object> studRec= new LinkedList<>();
		studRec.add(70);
		studRec.add("Steve");
		studRec.add(5.3);
		System.out.println(studRec.get(0));

	}

}
