/*
Jadan Lucas
11/25/18
A negative and a negative makes a positve
*/

import java.util.Scanner;

public class Exercise_5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	  	int counts = 0; 
		int posi = 0;   
		int nega = 0;            
		double total = 0;     
		double total2 = 0;   


		System.out.print("Enter a positive or negative number (0 to end): ");
		int number = input.nextInt();

		if (number == 0) {    
			System.out.println("Dead Zone.");
		}

		while (number != 0) {
			if (number > 0)
				posi++;   
		   	 else {
			  	 nega++;  
		  		 total += number;
		   		 counts++;               
		 
			}  		 
			
			System.out.print("Enter a positive or negative number (0 to end): ");
			number = input.nextInt();
		}
			total2 = posi + nega;
 
		System.out.println("The number of positives: " + posi);
		System.out.println("The number of negatives: " + nega);
	    System.out.println( "The totals are: " + total2);
	}
}
