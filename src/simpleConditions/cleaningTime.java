package simpleConditions;

import java.util.Scanner;

public class cleaningTime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the time the first son needs to clean: ");
		double sonAhours = Double.parseDouble(scan.nextLine());
		System.out.println("Please enter the time the second son needs to clean: ");
		double sonBhours = Double.parseDouble(scan.nextLine());
		System.out.println("Please enter the time the third son needs to clean: ");
		double sonChours = Double.parseDouble(scan.nextLine());
		System.out.println("Please enter the time the father will be gone: ");
		double fatherGoneHours = Double.parseDouble(scan.nextLine());

		double productivityA = 1/sonAhours;
		double productivityB = 1/sonBhours;
		double productivityC = 1/sonChours;
		double cleaningTime = (1/(productivityA +productivityB +productivityC));
		double cleaningTimeBreak = cleaningTime*1.15;
				
		System.out.printf("The cleaning time is %.2f%n", cleaningTimeBreak);
		
		if (cleaningTime < fatherGoneHours) {
			System.out.println("There is a surprise!");
		}else{
			System.out.println("There is no surprise!");

		}
	}
}
