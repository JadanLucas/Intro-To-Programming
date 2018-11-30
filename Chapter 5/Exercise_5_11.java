/*
Jadan Lucas
11/18/18
I like numbers
*/
import java.util.Scanner;

public class Exercise_5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			int perline = 10;
			int count = 0;
			
			for (int num = 100; num <= 200; num++){
				if (num % 5 == 0 ^ num % 6 == 0) {
					count++;
			 
					if (count % perline == 10)
						System.out.print(num);
					else
						System.out.print(num + " ");
					
				}
			}
			System.out.println();
	}
}
