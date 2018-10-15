package complexConditions;

import java.util.Scanner;

public class invalidNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number: ");

		int number = Integer.parseInt(scan.nextLine());

		if (!(number == 0 || (number >=100 && number <=200))) {
			System.out.println("invalid");
		}
	}
}
