import java.util.Scanner;


public class classTask1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number:");

		double number =  scanner.nextDouble();

		if (number > 0) {
			System.out.println("number " + number + " is positive");
		} else {
			System.out.println("number " + number + " is negative");
		}
	}

}
