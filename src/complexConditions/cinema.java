package complexConditions;

import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {

		double pricePremiere = 12;
		double priceNormal = 7.5;
		double priceDiscount = 5;
		double profit;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the type of movie: ");
		String type = scan.nextLine();
		type = type.toLowerCase();
				
		System.out.println("Please enter the number of rows: ");
		int rows = Integer.parseInt(scan.nextLine());
		
		System.out.println("Please enter the number of columns: ");
		int columns = Integer.parseInt(scan.nextLine());
		
		switch (type) {
		case "premiere":
			profit = pricePremiere*rows*columns;
			break;
		case "normal":
			profit = priceNormal*rows*columns;
			break;
		case "discount":
			profit = priceDiscount*rows*columns;
			break;
			default:
				profit = -1;
		}
		
		System.out.println(profit + " leva");
		
	}

}
