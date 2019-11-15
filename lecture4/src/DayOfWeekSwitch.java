
public class DayOfWeekSwitch {

	
	public static void main(String[] args) {
		
		int dayOfWeek = 8;
		int result = 1;
		
		switch (dayOfWeek) {
		
		case 7: 
			System.out.println("Sunday");
		case 6: 
			System.out.println("Saturday");	
		case 5: 
			System.out.println("Friday");	
		case 4: 
			System.out.println("Thursday");		
		case 3: 
			System.out.println("Wednesday");
		case 2: 
			System.out.println("Tuesday");	
		case 1: 
			System.out.println("Monday");
		break;
		
		default:
			System.out.println("Day not found");
		
		}
		

	}

}
