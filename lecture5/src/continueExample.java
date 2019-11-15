
public class continueExample {

	
	public static void main(String[] args) {
		
		System.out.println("Main app starts work");
		for (int i = 1; i <= 10; i++) {

			if (i == 6) {
				System.out.println("Still checking by continue");
				break;
			}

			
//			 if(i >= 6){ System.out.println("Still checking by continue");
//			 continue; 
			 

			System.out.println("Iteration " + i);
		}
		System.out.println("Main app ends work");
	}

}
