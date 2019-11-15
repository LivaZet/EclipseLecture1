/*Create a class Car
➢has fields: brand, maxSpeed, color.
➢has setter and getter for each field*/

class Car2 {
	String brand;
	double maxSpeed;
	String color;
	
	String aboutCar (String brand){
		return this.brand;
	}
	void helloCar (double maxSpeed, String color) {
		System.out.println("This " + color + " " + this.brand + "'s maximum speed is " + maxSpeed + " km/h.");
	}
}

public class Task3 {

	public static void main(String[] args) {
		
		Car2 goodCar = new Car2();
		goodCar.brand = "Bentley";
		goodCar.helloCar(200, "black");
	}

}

//class Car2 {
//	String brand;
//	double maxSpeed;
//	String color;
//	
//	public String getBrand(){
//		return this.brand;
//	}
//	public void setBrand(String brand){
//		this.brand = brand;
//	}
//		
//}
//	public class Task3 {
//	
//		public static void main(String[] args) {
//			
//			Car2 car = new Car2();
//			car.setBrand("Ferrari");
//			String name = car.getBrand();
//			System.out.println ("My car brand is: " + name);
//		}
//	}
		