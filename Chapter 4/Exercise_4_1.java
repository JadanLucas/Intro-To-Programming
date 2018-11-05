/*
Jadan Lucas
10/26/18
PENTAGRAMS
*/
import java.util.Scanner;

public class Exercise_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter length from the center of the vertex: ");
		double r = input.nextDouble();
		
		double s = (r + r) * Math.sin(Math.PI / 5);
		double area = 5 * s * s / (4 * Math.tan(Math.PI / 5)); 
		
		System.out.println("Area of Pentagon is: " + area);

	}
}