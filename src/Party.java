import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the price of one litre whiskey in leva: ");
		double priceWhiskey = Double.parseDouble(scan.nextLine());
		double priceRakia = priceWhiskey/2;
		double priceWine= priceRakia*(1-0.4);
		double priceBeer= priceRakia*(1-0.8);
		
		System.out.println("Please type how many litres of beer you will buy: ");
		double litresBeer= Double.parseDouble(scan.nextLine());
		System.out.println("Please type how many litres of wine you will buy: ");
		double litresWine= Double.parseDouble(scan.nextLine());
		System.out.println("Please type how many litres of rakia you will buy: ");
		double litresRakia= Double.parseDouble(scan.nextLine());
		System.out.println("Please type how many litres of whiskey you will buy: ");
		double litresWhiskey= Double.parseDouble(scan.nextLine());
		
		double price = (priceWhiskey*litresWhiskey) + (priceWine*litresWine) + (priceBeer*litresBeer) + (priceRakia*litresRakia);
		System.out.printf("The price will be %.2f leva.", price);
	}

}
