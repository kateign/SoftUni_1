package complexConditions;

import java.util.Scanner;

public class fruitsDays {

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
			if (product.equals("banana")) {
				price = quantity * bananaWorkDay;
			} else if (product.equals("apple")) {
				price = quantity * appleWorkDay;
			} else if (product.equals("orange")) {
				price = quantity * orangeWorkDay;
			} else if (product.equals("grapefruit")) {
				price = quantity * grapefruitWorkDay;
			} else if (product.equals("kiwi")) {
				price = quantity * kiwiWorkDay;
			} else if (product.equals("pineapple")) {
				price = quantity * pineappleWorkDay;
			} else if (product.equals("grapes")) {
				price = quantity * grapesWorkDay;
			}
			System.out.println("The price is " + price + ".");

		}else if (day.equals("weekend")){
			if (product.equals("banana")) {
				price = quantity * bananaWeekend;
			} else if (product.equals("apple")) {
				price = quantity * appleWeekend;
			} else if (product.equals("orange")) {
				price = quantity * orangeWeekend;
			} else if (product.equals("grapefruit")) {
				price = quantity * grapefruitWeekend;
			} else if (product.equals("kiwi")) {
				price = quantity * kiwiWeekend;
			} else if (product.equals("pineapple")) {
				price = quantity * pineappleWeekend;
			} else if (product.equals("grapes")) {
				price = quantity * grapesWeekend;
			}
			System.out.println("The price is " + price + ".");

		}else {
			System.out.println("Error");
		}
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);
	}	
}
