package simpleConditions;

import java.util.Scanner;

public class plus15Minutes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter hour: ");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter minutes: ");
		int minutes = Integer.parseInt(scan.nextLine());

		if (minutes > 45) {
			minutes -=45;

			if (hour <23 ) {
				hour += 1;
			}else {
				hour = 0;
			}
		}else {
			minutes += 15;
		}

		if (minutes < 10) {
			System.out.printf("In 15 minutes it will be %d:0%d. ", hour, minutes);
		}else {
			System.out.printf("In 15 minutes it will be %d:%d. ", hour, minutes);
		}
	}
}
