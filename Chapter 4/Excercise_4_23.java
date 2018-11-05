/*
Jadan Lucas
11/1/18
Net Nobodies pay
*/

import java.util.Scanner;
import java.nio.file.*;
import javax.security.sasl.*;

class Exercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What your name: ");
		String name = input.next();
		
		System.out.print("Enter the number of hours you've worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter your payrate: $");
		double payrate = input.nextDouble();
		
		System.out.print("Enter Federal Tax withholding rate: ");
		double fedtax = input.nextDouble();
		
		System.out.print("Enter state Tax withholding rate: ");
		double statetax = input.nextDouble();
		
		//math party
		System.out.println(" ");
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payrate);
		double grosspay = 0.0;
		grosspay = hours * payrate;
		System.out.println("Grosspay: $" + grosspay);
		System.out.println("Deductions: ");
		double percentfedtax = fedtax * 100;
		double fedgross = grosspay * fedtax;
		System.out.println("	Ferderal Withholding (" + percentfedtax + "): " + fedgross);
		double percentstatetax = statetax * 100;
		double stategross = grosspay * statetax;
		System.out.println("	State Withholding (" + percentstatetax + "): " + stategross);
		double deduction = stategross + fedgross;
		System.out.println("	Total Deduction: " + deduction);
		System.out.println(" ");
		double netpay = grosspay - (stategross + fedgross);
		System.out.println("Net Pay: " + netpay);
		
	}
}

