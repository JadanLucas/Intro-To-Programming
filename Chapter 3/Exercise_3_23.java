/*
Jadan Lucas
10/25/18
I like Squares
*/
import java.util.Scanner;

public class Exercise_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Point of X: ");
		double x = input.nextDouble();
		
		System.out.print("Point of Y: ");
		double y = input.nextDouble();

//A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2.
		
		boolean inside = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);


		System.out.println("Point " + x + ", " + y + " is " + inside + ". ");
	}
}