
/*Homework:
Given:
int[][] dataSet = {
    {1,-5, 98,20},
    {3,-68,2},
    {7,29,0,-1,-68}
}
    Return to user coordinated of the smallest element and its value*/


public class ArrayMinimumValue {

	
	public static void main(String[] args) {
		
		int[][] dataSet = { 
				{ 1, -5, 98, 20 }, 
				{ 3, -68, 2 },
				{ 7, 29, 0, -1, -68 } 
				};
		
		int smallestValue = dataSet[0][0];
		int smallestElemRow = 0;
		int smallestElemCol = 0;
		
		for (int i = 0; i < dataSet.length; i++) {
			int[] row = dataSet[i];
			for (int j = 0; j < row.length; j++) {
				if (row[j] < smallestValue) {
					smallestValue = row[j];
					smallestElemRow = i;
					smallestElemCol = j;
				}
			}
		}
		System.out.println("The smallest value in dataSet is " + smallestValue
				+ " its coordinates are row=" + smallestElemRow + " col="
				+ smallestElemCol);
	}
}
