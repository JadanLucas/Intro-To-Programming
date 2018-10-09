/*
Jadan Lucas
10/3/18
Monthly Savings
2_13
*/

import java.util.Scanner;


public class Exercise_2_13 {

	 public static void main(String []args){
		 Scanner input = new Scanner(System.in);
	
	 double monthly_rate = 0.00417;
	
	//Prompt the users
	
	System.out.print("Enter desired monthly savings: ");
	double savings = input.nextDouble();
	
	double total_amount = savings * (1 + monthly_rate);
	total_amount = (100 + total_amount) * (1 + monthly_rate);
	total_amount = (100 + total_amount) * (1 + monthly_rate);
	total_amount = (100 + total_amount) * (1 + monthly_rate);
	total_amount = (100 + total_amount) * (1 + monthly_rate);
	
	System.out.println("After 6 months the account is going to be: " + total_amount);
	
	 }
}

