/*
Jadan Lucas
Something about zero's?
*/
import java.util.Scanner;

class Exercise_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

	
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter a prefix: ");
		int prefix = input.nextInt();


		String num = number + ""; 
		

		if (num.length() < prefix) {
			for (int leng = prefix - num.length(); leng > 0; leng--) {
				num = 0 + num;
			}
		}
		System.out.print(num);
	}
}
