package breakContinue;

public class Break_Ex {

	public static void main(String[] args) {
		
		int key=8;
		
		for(int k=5;k<10;k++) {
			
			if(key==k)// 8==5  8==6  8==7 8==8
			break;//exit the loop based on above condition
			
			System.out.println(k);
		}
		
	}

}
