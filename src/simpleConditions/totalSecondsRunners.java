package simpleConditions;

import java.util.Scanner;

public class totalSecondsRunners {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the seconds for the three runners: ");
		
		int seconds1 = Integer.parseInt(scan.nextLine());
		int seconds2 = Integer.parseInt(scan.nextLine());
		int seconds3 = Integer.parseInt(scan.nextLine());
		int minutes = (seconds1 + seconds2 + seconds3)/60;
		System.out.println(minutes);
		int seconds = minutes % 60;
		//shto be, shto beeeeee.
		System.out.println(seconds);
		
		if (seconds < 10) {
			System.out.printf("The total time is %d:0%d.%n", minutes, seconds);
		} else {
			System.out.printf("The total time is %d:%d.%n", minutes, seconds);
					}
	}

}
