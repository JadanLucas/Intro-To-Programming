/*
Jadan Lucas
10/9/18
cars beep beep
2_23
*/

import java.util.Scanner;

public class Exercise_2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
      
		System.out.print("Enter the distance you are driving: ");
		double distance = input.nextDouble();
      
		System.out.print("Enter the miles  per gallon: ");
		double gallon = input.nextDouble();
      
		System.out.print("Enter the price now in per gallon : ");
		double price = input.nextDouble();

		//"Take the current price of fuel and divide it by your vehicle's miles per gallon..."
		double drivingCost = (distance / gallon) * price;

		System.out.println("Cost of driving is: $" + drivingCost);
	}
}


