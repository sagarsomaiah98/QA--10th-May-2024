package Arrays;

public class Array_Ex2 {

	public static void main(String[] args) {
		
		int[] marks= new int[7];
		
		marks[0]=90;
		marks[1]=85;
		marks[4]=75;
		marks[3]=45;
		marks[6]=55;
		marks[2]=88;
		marks[3]=99;
		marks[5]=35;
		
		
		System.out.println(marks.length);// it will fetch the length of array
		
		/*
		 * System.out.println(marks[0]); System.out.println(marks[1]);
		 * System.out.println(marks[2]); System.out.println(marks[3]);
		 * System.out.println(marks[4]); System.out.println(marks[5]);
		 * System.out.println(marks[6]);
		 */
		System.out.println("**************************************");
		marks[14]=66;
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println(marks[i]);
		}
		

	}

}
