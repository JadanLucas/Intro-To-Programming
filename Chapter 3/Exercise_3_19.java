/*
Jadan Lucas
10/23/18
My favorite shape is a triangle
*/
import java.util.Scanner;

public class Exercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double perimeter = 0;
	
		//Ask for Sides
		System.out.print("First Side: ");
		double side1 = input.nextDouble();
		
		System.out.print("Second Side: ");
		double side2 = input.nextDouble();

		System.out.print("Third Side: ");
		double side3 = input.nextDouble();
		
		//math stuff
		if((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1){
		perimeter = side1 + side2 + side3;
			
		System.out.print("Your perimeter: " + perimeter);		
		}

		else{
			System.out.print("Invalid Input!");
		}
		
		
	}
}
