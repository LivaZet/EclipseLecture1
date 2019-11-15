/*Create a class DrivingRule which has:
Instance variables: name and description
Static variable: country equals to Latvia
2 constant max speed in city/outside
Create few instance of DrivingRule
DrivingRule should counts total amount of rules which we have created*/

class DrivingRule {
	String name;
	String description;
	private static String country = "Latvia";
	private static final double MAX_SPEED_IN_CITY = 50;
	private static final double MAX_SPEED_OUTSIDE_CITY = 90;
	private static int totalRules;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	void firstDrivingRule(){
		totalRules++;
		System.out.println("The maximum driving speed in a city is set to " + MAX_SPEED_IN_CITY + " km/h in " + country);
	}
	void numberOfRules() {
		System.out.println("Total rules learned: " + totalRules);
	}
}

public class StaticFinal {

	public static void main(String[] args) {
		
		DrivingRule example1 = new DrivingRule ();
		example1.firstDrivingRule();
		example1.firstDrivingRule();
		example1.numberOfRules();
		

	}

}
