package simpleConditions;

import java.util.Scanner;

public class dancersChoreography {

	public static void main(String[] args) {
		
		double percentLearnedStepsPerDay = 0.13;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please write how many steps do the dancers need to learn: /n");
		double totalNumberOfSteps = Double.parseDouble(scan.nextLine());
		
		System.out.println("How many dancers are there? /n");
		double totalNumberOfDancers = Double.parseDouble(scan.nextLine());

		System.out.println("Please write how many day do you have for preparation: /n");
		double totalNumberOfDays = Double.parseDouble(scan.nextLine());
		
		double percentStepsPerDayNeeded = 1/totalNumberOfDays;
		double percentStepsPerDayReally = (totalNumberOfSteps/ totalNumberOfDays) /totalNumberOfSteps;
				
		double stepsPerDancerPerDay = percentLearnedStepsPerDay * totalNumberOfSteps;
		if (totalNumberOfDays*stepsPerDancerPerDay>=totalNumberOfSteps) {
			System.out.println("Yes, you will succeed in that goal! Required percent of steps learned per day: " + percentStepsPerDayNeeded);
		}else {
			System.out.println("No, you will not succeed in that goal! Required percent of steps learned per day: " + percentStepsPerDayNeeded);
		}
	}
}
