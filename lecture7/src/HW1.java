
//Homework
//Create a class with name Circle
//User should be able to define radius size for the circle using double type
//Class should have method which will return radius of circle getRadius()
//Class should have methods which will return area of circle getArea()

//import java.util.Scanner;
//
//class Circle {
//	double radius;
//	double area;
//	
//	void getRadius() {
//		System.out.println("The radius of the circle is " + radius + ".");
//	}
//	                 
//	void getArea() {
//		System.out.println("The area of the circle is " + area + ".");
//	}
//}
//
//public class HW1 {
//	
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter circle radius:");
//		double enteredRadius = scanner.nextDouble();
//		double calculatedArea = Math.PI * (enteredRadius * enteredRadius);
//		
//		Circle circle1 = new Circle();
//		circle1.radius = enteredRadius;
//		circle1.area = calculatedArea;
//		circle1.getRadius();
//		circle1.getArea();
//	}
//}



class Circle {
	double radius;
		
	double getRadius(){
		return radius;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
}

public class HW1 {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.radius = 2.0;
		System.out.println(circle.getArea());
	}
}

