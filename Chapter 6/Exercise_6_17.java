/*
Jadan Lucas
Join the Matrix
*/
import java.util.Scanner;
class Exercise_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter the num: ");
		int num = input.nextInt();

		printMatrix(num);
	}


	public static void printMatrix(int num) {
		for (int row = 0; row < num; row++) {
			for (int column = 0; column++) {
	
				System.out.print((Math.random() * 2));
			}
			System.out.println();
		}
	}
}
