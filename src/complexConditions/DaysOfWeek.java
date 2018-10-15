package complexConditions;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please write a number between 1 and 7: ");
		String number = scan.nextLine();
		
		switch (number) {
		case "1":
			number = "Monday";
			break;
		case "2":
			number = "Tuesday";
			break;
		case "3":
			number = "Wednesday";
			break;
		case "4":
			number = "Thursday";
			break;
		case "5":
			number = "Friday";
			break;
		case "6":
			number = "Saturday";
			break;
		case "7":
			number = "Sunday";
			break;
		default:
			number = "Error!";
			break;
		}
		System.out.println(number);
	}
}
