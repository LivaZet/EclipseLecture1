import java.util.Scanner;


public class loopTask2 {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");

		int number = scanner.nextInt();

		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		} while (value != 0);
		System.out.println("Got 0!");
	}

}
