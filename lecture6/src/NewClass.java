class Phone {
	// fields
	String brand;
	String color;
	int age;
		
	void sayHi(){
		System.out.println("This " + color + " phone is a " + age + " months old " + brand + ".");
	}
}
public class NewClass {

	public static void main(String[] args) {
		
		Phone samsung = new Phone ();
		samsung.brand = "Samsung";
		samsung.color = "red";
		samsung.age = 6;
		samsung.sayHi();

	}

}
