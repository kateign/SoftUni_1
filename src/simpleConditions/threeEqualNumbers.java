package simpleConditions;

import java.util.Scanner;

public class threeEqualNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three numbers: ");

		int number1 = Integer.parseInt(scan.nextLine());
		int number2 = Integer.parseInt(scan.nextLine());
		int number3 = Integer.parseInt(scan.nextLine());

		if (number1 == number2) {
			if(number2 == number3) {
				System.out.println("They are equal");
			}else {
				System.out.println("They are not equal");
			}
		}else {
				System.out.println("They are not equal");
			}
		}
	}
