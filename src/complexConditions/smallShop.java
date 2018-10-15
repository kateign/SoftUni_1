package complexConditions;

import java.util.Scanner;

public class smallShop {

	public static void main(String[] args) {

		double priceSofiaCoffee = 0.50;
		double priceSofiaWater = 0.80;
		double priceSofiaBeer = 1.20;
		double priceSofiaSweets = 1.45;
		double priceSofiaPeanuts = 1.60;

		double pricePlovdivCoffee = 0.40;
		double pricePlovdivWater = 0.70;
		double pricePlovdivBeer = 1.15;
		double pricePlovdivSweets = 1.30;
		double pricePlovdivPeanuts = 1.50;

		double priceVarnaCoffee = 0.45;
		double priceVarnaWater = 0.70;
		double priceVarnaBeer = 1.10;
		double priceVarnaSweets = 1.35;
		double priceVarnaPeanuts = 1.55;

		double price = 0;

		Scanner scan = new Scanner (System.in);

		System.out.println("Please write the name of the city: ");
		String city = scan.nextLine();
		city = city.toLowerCase();

		System.out.println("Please write the name of the product: ");
		String product = scan.nextLine();
		product = product.toLowerCase();

		System.out.println("Please write the quantity you would like: ");
		double quantity = Double.parseDouble(scan.nextLine());

		if (city.equals("sofia")) {
			if (product.equalsIgnoreCase("coffee")) {
				price = quantity*priceSofiaCoffee;
			}else if (product.equals("water")) {
				price = quantity*priceSofiaWater;
			}else if (product.equals("beer")) {
				price = quantity*priceSofiaBeer;
			}else if (product.equals("sweets")) {
				price = quantity*priceSofiaSweets;
			}else if (product.equals("peanuts")) {
				price = quantity*priceSofiaPeanuts;
			}
		}else if (city.equals("plovdiv")) {
			if (product.equals("coffee")) {
				price = quantity*pricePlovdivCoffee;
			}else if (product.equals("water")) {
				price = quantity*pricePlovdivWater;
			}else if (product.equals("beer")) {
				price = quantity*pricePlovdivBeer;
			}else if (product.equals("sweets")) {
				price = quantity*pricePlovdivSweets;
			}else if (product.equals("peanuts")) {
				price = quantity*pricePlovdivPeanuts;
			}
		}else if (city.equals("varna")) {
			if (product.equals("coffee")) {
				price = quantity*priceVarnaCoffee;
			}else if (product.equals("water")) {
				price = quantity*priceVarnaWater;
			}else if (product.equals("beer")) {
				price = quantity*priceVarnaBeer;
			}else if (product.equals("sweets")) {
				price = quantity*priceVarnaSweets;
			}else if (product.equals("peanuts")) {
				price = quantity*priceVarnaPeanuts;
			}
		}
		System.out.printf("The price for %.0f %s in %s is %.2f.", quantity, product, city, price);


	}
}
