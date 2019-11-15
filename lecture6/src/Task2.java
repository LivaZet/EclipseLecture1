import java.util.Arrays;
import java.util.Scanner;


public class Task2 {

	
	public static void main(String[] args) {
		
/*Write a program that fills a 2-dim (4x4)array with numbers from 0 to 15, using loop:
0, 1, 2, 3
4, 5, 6, 7
8, 9, 10, 11
12,13,14,15*/
		
		
//		int[][] dataSet = new int[4][4];
//
//		int ordinal = 0;
//
//		for (int i = 0; i < dataSet.length; i++) {
//			int[] row = dataSet[i];
//			for (int j = 0; j < row.length; j++) {
//				row[j] = ordinal;
//				ordinal++;
//			}
//		}
//		for (int[] row : dataSet) {
//			System.out.println(Arrays.toString(row));
//		}
//	}
//}



/*Write a program which allows for user set value in 2-dimensional array
(5x4):
Enter row: 3
Enter col: 4
Enter value: 1
Output:
0,0,0,0,0
0,0,0,0,0
0,0,0,1,0
0,0,0,0,0*/

		int[][] table = new int[5][4];

		Scanner scanner = new Scanner(System.in);

		// Ask user for col number
		System.out.println("Enter column:");
		int userCol = scanner.nextInt();
		// + validation
		if (userCol > 4 || userCol < 1) {
			System.out.println("Entered invalid column index");
			return;
		}
		// + shift by -1
		int columnIndex = userCol - 1; 
		
		// Ask user for row number
		System.out.println("Enter row:");
		int userRow = scanner.nextInt();
		// + validation
		if (userRow > 5 || userRow < 1) {
			System.out.println("Entered invalid row index");
			return;
		}
		// + shift by -1
		int rowIndex = userRow - 1; 
		
		// Ask user for value
		System.out.println("Enter value:");
		int newValue = scanner.nextInt(); 
		
		// assign value to array cell
		table[rowIndex][columnIndex] = newValue; 
		
		// print out
		for (int[] row : table) {
			System.out.println(Arrays.toString(row));
		}
	}

}
