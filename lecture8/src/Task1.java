//class Car {
//	//states
//	String color;
//	int speed;
//	String name;
//	
//	//behaviour
//	void drive () {
//		System.out.println("drive name " + this.name);
//	}
//	String driveOnASpecificLight(int speed, String light){
//		return "Driving on " + light + " with speed " + speed;
//	}
//}
//		public class Task1 {
//	
//	public static void main(String[] args) {
//		
//		Car myCar = new Car();
//		myCar.name = "MySuperDuperCar";
//		myCar.drive();
//		
//		String msg = myCar.driveOnASpecificLight(50, "green");
//		System.out.println(msg);
//		
//		Car stolenCar = new Car();
//		stolenCar.name = "StolenCar";
//		stolenCar.drive();
//	}
//}


/*Create a method which has 2 arguments one of type boolean and
another double and this method should return String value as
concatenation of arguments*/

class Phone {
		
	String introducePhone(boolean awesome, double version){
		return "" + awesome + version;
		}
}

public class Task1 {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone ();
		String msg = myPhone.introducePhone (true, 2.0);
		System.out.println(msg);
		
	}
}