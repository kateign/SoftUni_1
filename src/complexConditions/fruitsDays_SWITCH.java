package complexConditions;

import java.util.Scanner;

public class fruitsDays_SWITCH {

	public static void main (String [] args) {

			
		double bananaWorkDay = 2.5;
		double appleWorkDay = 1.2;
		double orangeWorkDay = 0.85;
		double grapefruitWorkDay = 1.45;
		double kiwiWorkDay = 2.7;
		double pineappleWorkDay = 5.5;
		double grapesWorkDay = 3.85;

		double bananaWeekend = 2.7;
		double appleWeekend = 1.25;
		double orangeWeekend = 0.9;
		double grapefruitWeekend = 1.6;
		double kiwiWeekend = 3.0;
		double pineappleWeekend = 5.6;
		double grapesWeekend = 4.2;

		double price = 0;

		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter a product: ");
		String product = scan.nextLine();
		product.equalsIgnoreCase(product);

		System.out.println("Please enter quantity: ");
		double quantity= Double.parseDouble(scan.nextLine());

		System.out.println("Please enter a day: ");
		String day = scan.nextLine();
		
		long startTime = System.nanoTime();    
		// ... the code being measured ...    

		if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday")){
			day = "workday";
		}else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
			day = "weekend";
		}

		if (day.equals("workday")){
			switch (product) {
			case "banana": 
				price = bananaWorkDay;
				break;
			case "apple":
				price = appleWorkDay;
				break;
			case "orange":
				price = orangeWorkDay;
				break;
			case "grapefruit":
				price = grapefruitWorkDay;
				break;
			case "kiwi":
				price = kiwiWorkDay;
				break;
			case "pineapple":
				price = pineappleWorkDay;
				break;
			case "grapes":
				price = grapesWorkDay;
				break;
			}
			System.out.println("The price is " + price*quantity + ".");

		}else if (day.equals("weekend")){
			switch (product) {
			case "banana": 
				price = bananaWeekend;
				break;
			case "apple":
				price = appleWeekend;
				break;
			case "orange":
				price = orangeWeekend;
				break;
			case "grapefruit":
				price = grapefruitWeekend;
				break;
			case "kiwi":
				price = kiwiWeekend;
				break;
			case "pineapple":
				price = pineappleWeekend;
				break;
			case "grapes":
				price = grapesWeekend;
				break;
			}
			System.out.println("The price is " + price*quantity + ".");

		}else {
			System.out.println("Error");
		}
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);
	}	
}
