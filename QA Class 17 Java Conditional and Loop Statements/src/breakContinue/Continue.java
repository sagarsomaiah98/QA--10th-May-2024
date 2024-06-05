package breakContinue;

public class Continue {

	public static void main(String[] args) {
int key=5;
		
		for(int k=1;k<10;k++) {
			
			if(key<k) // 7==7
			continue;//skip the below the lines
			
			System.out.println(k);
		}
	}

}
