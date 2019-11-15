import java.util.Scanner;

public class NewUser {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String userName = scanner.next(); 
		
		System.out.println("Enter your age: ");
		int  userAge = scanner.nextInt(); 
		
		System.out.println("Hi, my name is " + userName + " and I'm " + userAge + " years old.");

	}

}
