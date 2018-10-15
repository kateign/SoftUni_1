package simpleConditions;

import java.util.Scanner;

public class biggerNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Please enter two numbers: ");

			int number1 = Integer.parseInt(scan.nextLine());
			int number2 = Integer.parseInt(scan.nextLine());

			if (number1 > number2) {
				System.out.printf("The bigger number is %d.%n", number1);
			}else {
				System.out.printf("The bigger number is %d.%n", number2);
			}
		}while (true);

	}

}
