/*
Jadan Lucas
11/25/18
the great pyramid of SWATC 
*/


import java.util.Scanner;

public class Exercise_5_17 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.print("Enter the number of lines (1-15): ");
		int lines = input.nextInt();


		for (int rows = 1; rows <= lines; rows++) {

			for (int space = lines - rows; space >= 1; space--) {
				System.out.print("  ");
			}
		 
				for (int left = rows; left >= 2; left--) {
			   	 System.out.print(left + " ");
			}
 
					for (int right = 1; right <= rows; right++) {
			  		  System.out.print(right + " ");
			}

			System.out.println();
		}
	}
}
