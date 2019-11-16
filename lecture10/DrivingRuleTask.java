/*Create a class DrivingRule which has:
Instance variables: name and description
Static variable: country equals to Latvia
2 constant max speed in city/outside
Create few instance of DrivingRule
DrivingRule should counts total amount of rules which we have created*/

class DrivingRule {
	private final String NAME_1 = "DrivingRule1";
	private final String NAME_2 = "DrivingRule2";
	private final String NAME_3 = "DrivingRule3";
	private final String NAME_4 = "DrivingRule4";
	private String description;
	private static String country = "Latvia";
	private static final double MAX_SPEED_IN_CITY = 50;
	private static final double MAX_SPEED_OUTSIDE_CITY = 90;
	private static int totalRules;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String description1() {
		return "The maximum driving speed in a city is set to " + MAX_SPEED_IN_CITY + " km/h in " + country + ".";
	}
	public String description2() {
		return "The maximum driving speed outside a city is set to " + MAX_SPEED_OUTSIDE_CITY + " km/h in " + country + ".";
	}
	public String description3() {
		return "The driver should not cross the red light.";
	}
	public String description4() {
		return "The driver should stop before a pedestrian crossing if they see a pedestrian about to cross the pedestrian crossing.";
	}
	public String totalRules() {
		return "Total rules learned: " + totalRules;
	}
	void DrivingRule1(){
		totalRules++;
		System.out.println(description1() + totalRules());
	}
	void DrivingRule2(){
		totalRules++;
		System.out.println(description2() + totalRules());
	}
	void DrivingRule3(){
		totalRules++;
		System.out.println(description3() + totalRules());
	}
	void DrivingRule4(){
		totalRules++;
		System.out.println(description4() + totalRules());
	}
	
}

public class DrivingRuleTask {

	public static void main(String[] args) {
		
		DrivingRule example1 = new DrivingRule ();
		example1.DrivingRule1();
		example1.DrivingRule2();
		example1.DrivingRule3();
		example1.DrivingRule4();
		
	}

}
