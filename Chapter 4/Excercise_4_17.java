/*
Jadan Lucas
10/26/18
Your monthly rent is due
*/

import java.util.Scanner;
import java.nio.file.*;

class Exercise_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter desired year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String month = input.next();
		
		//starting with all 31 days
		switch(month){
			case "jan":
			System.out.print("You have 31 Days in this month.");
			break;
			case "mar": 
			System.out.print("You have 31 Days in this month.");
			break;
			case "may": 
			System.out.print("You have 31 Days in this month.");
			break;
			case "jul": 
			System.out.print("You have 31 Days in this month.");
			break;
			case "aug": 
			System.out.print("You have 31 Days in this month.");
			break;
			case "oct": 
			System.out.print("You have 31 Days in this month.");
			break;
			case "dec": 
			System.out.print("You have 31 Days in this month.");
			break;
			
			// 30 days 
			case "apr": 
			System.out.print("You have 30 Days in this month.");
			break;
			case "jun": 
			System.out.print("You have 30 Days in this month.");
			break;
			case "sep": 
			System.out.print("You have 30 Days in this month.");
			break;
			case "nov": 
			System.out.print("You have 30 Days in this month.");
			break;
			
			//feb (leap year)
			
			case "feb":if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				System.out.print("You have 29 Days in this month.");
				break;
			}
			else { System.out.print("You have 28 Days in this month.");
			break;
			}
		}
	
	}
}

