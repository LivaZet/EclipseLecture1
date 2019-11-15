class User {
	// fields
	String name;
	int age;
	boolean man;
	String hair;
	int height;
	
	void sayHi(){
		System.out.println("Hi, my name is " + name + ". I'm " + age
			+ " years old. My hair color is " + hair + ", and I'm " + height + " cm tall.");
	}
}

public class UserField {
	
	public static void main(String[] args) {
		
//		String name = "Peter";
//		int age = 21;
//		boolean man = false;
//		
//		
//		String name1 = "Anna";
//		int age2 = 22;
//		boolean man2 = true;
//		
//		User peter = new User();
//		peter.name = "Peter";
//		peter.age = 21;
//		peter.man = true;
//		System.out.println("Hi, my name is " + peter.name + " I'm " + peter.age
//				+ " old");
//		
//		User anna = new User();
//		anna.name = "Anna";
//		anna.age = 20;
//		anna.man = false;
//		System.out.println("Hi, my name is " + anna.name + " I'm " + anna.age
//				+ " old");
//		
//		User john = new User();
//		john.name = "John";
//		john.age = 30;
//		john.man = true;
//		john.hair = "black";
//		john.height = 190;
//		System.out.println("Hi, my name is " + john.name + ". I'm " + john.age
//				+ " years old. My hair color is " + john.hair + ", and I'm " + john.height + " cm tall.");


		User carla = new User();
		carla.name = "Carla";
		carla.age = 27;
		carla.man = false;
		carla.hair = "red";
		carla.height = 155;
		carla.sayHi();
		
		User marcus = new User();
		marcus.name = "Marcus";
		marcus.age = 45;
		marcus.man = true;
		marcus.hair = "brown";
		marcus.height = 185;
		marcus.sayHi();

	}
}