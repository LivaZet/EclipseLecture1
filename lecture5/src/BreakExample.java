
public class BreakExample {

	
	public static void main(String[] args) {
		
		System.out.println("Main app starts work");
		for (int i = 1; i <= 10; i++){
			
			if(i == 5){
				System.out.println("Reached break statement on iteration = " + i);
				break;
			}
			System.out.println("Iteration " + i);
		}		
		System.out.println("Main app continue work");
	}
	}

