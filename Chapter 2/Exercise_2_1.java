/*
Jadan Lucas
Date: 10/3/2018

Exercise 2-1
*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int celsius = 0;
		double fahrenheit = 0.0;

		System.out.print("Enter the degree in Celsius: ");
		celsius = input.nextInt();
		
			fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		
		
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		
		
	}
}