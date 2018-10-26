/*
Jadan Lucas
October 17, 2018
Counting the Alphabet
*/
import java.util.Scanner;

public class Exercise_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Enter a: ");
		double a = input.nextDouble();
      
      	System.out.print("Enter b: ");
		double b = input.nextDouble();
      
     	 System.out.print("Enter c: ");
     	double c = input.nextDouble();
      
      	System.out.print("Enter d: ");
		double d = input.nextDouble();
      
      	System.out.print("Enter e: ");
		double e = input.nextDouble();
      
      	System.out.print("Enter f: ");
		double f = input.nextDouble();

		// "If ad - bc is 0, report that “The equation has no solution.”
		if (a * d - b * c == 0){
			System.out.println("The equation has no solution.");
		}
		else
		{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("X is " + x);
          	System.out.println("Y is " + y);
		}
	}
}

