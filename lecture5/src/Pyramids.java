import java.util.Scanner;


public class Pyramids {

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner (System.in);
		System.out.print("Please enter triangle size: ");
		int size = scanner.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}*/
		
		/*for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
			System.out.print(j + 1);
			}
			System.out.println("");
		}
	}
}*/
		
		
		
		
		
        int rows = 4, number = 1;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
	}
}
}
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter triangle size");
		int size = scanner.nextInt();
		for(int i=1; i <= size; i++){
			String row = "";
			for(int j=1;j<=i;j++){		
				row = row + "" + i;
				//System.out.print(i);
			}
			System.out.println(row);
		}
	}
}*/
