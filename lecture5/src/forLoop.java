import java.util.Scanner;


public class forLoop {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many times should I repeat?");
		
		int iteration = scanner.nextInt();
		
		for (int i = 1; i<=iteration; i++) {
			System.out.println ("Repeat" + i);
	}
	}
}
