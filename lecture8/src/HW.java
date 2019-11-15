
/*Create a class Factory
which has fields:
	* name, location, workerAmounthas methods:
	* hireNewWorker("Engineer"), it should increase workerAmount by 1 and print out into console information  how many workers there are
	* fireWorker("Plumber") it should decrease workerAmount by 1 and print out into console information  how many workers there are
	* fireAll()  it should set workerAmount = 0
	* bankrupt() it should call fireAll(),  inform user about current operation and prohibiting further operation of hire new workers, think about storing some state of factory (edited) 
*/

class FactoryT {

	String name;
	String location;
	static int workerAmount = 5;
	void info() {
		System.out.println("There are " + workerAmount + " workers in the factory.");
	}
	int fireAll() {
		return this.workerAmount=0;
	}
	void fired() {
		System.out.println ("There are " + fireAll() + " workers in the factory");
	}
	void bankrupt () {
		System.out.println ("The factory is bankrupted.");
	}
}

	public class HW {

	public static void main(String[] args) {

		FactoryT factory = new FactoryT ();

		FactoryT newWorker = new FactoryT();
		newWorker.name = "Engineer";
		FactoryT.workerAmount++;
		newWorker.info();

		FactoryT fireWorker = new FactoryT();
		fireWorker.name = "Plumber";
		FactoryT.workerAmount--;
		fireWorker.info();

		factory.fired();

		factory.bankrupt();

	}
}



