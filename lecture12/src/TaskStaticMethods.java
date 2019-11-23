//Create a static method which will do sum of passed arguments
//Print out all passed arguments into public static void main(String[] args) as one concatenated string

/*public class Hometask1 {	*//**
	 Given:
	int[][] dataSet = {
    {1,-5, 98,20},
    {3,-68,2},
    {7,29,0,-1,-68}
}    Find the sum of the dataSet cells
    Return to user coordinated of the smallest element and its value
	 *//*
	public static void main(String[] args) {
		int[][] dataSet = {
			    {1,-5, 98,20},
			    {3,-68,2},
			    {7,29,0,-1,-68}
		};		
		int sum = 0;
		for (int i = 0;i < dataSet.length;i++){
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++){
				int cellValue = row [j];
				sum = sum + cellValue;
			}
		}
		System.out.println (sum);
	}}*/


public class TaskStaticMethods {

	public static int sum(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;
	}
	
	
	
	public static int sumArrayValues(int[] myArray) {
		
		int sum = 0;
		for (int i = 0; i < myArray.length; i++){
			sum = sum + myArray[i];
		}
		return sum;
	}

	

	public static void main(String[] args) {

		int[] myArray = {1, 2, 3, 4, 5, 6};
//		System.out.println(sum(5, 6, 7));
//		System.out.println(sum(20, -7, 9));
//		System.out.println(sum(16, 1, 111));
//		System.out.println(sum(1, -1, 12));

		int[] data = new int[4];
		System.out.println(sumArrayValues(myArray));
//		System.out.println(printOut(data));

	}

}
