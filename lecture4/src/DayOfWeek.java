
public class DayOfWeek {

	
	public static void main(String[] args) {
		
		int dayIndex = 3;
		if(dayIndex == 1){
			System.out.println("Monday");
		}else if (dayIndex == 2){
			System.out.println("Tuesday");
		}else if (dayIndex == 3){
			System.out.println("Wednesday");
		}else if (dayIndex == 4){
			System.out.println("Thursday");
		}else if (dayIndex == 5){
			System.out.println("Friday");
		}else if (dayIndex == 6){
			System.out.println("Saturday");
		}else if (dayIndex == 7){
			System.out.println("Sunday");
		}else if (dayIndex > 7 || dayIndex < 1){
			System.out.println("Day not found");
		}
		
	}

}
