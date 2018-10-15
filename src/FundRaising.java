import java.util.Scanner;

public class FundRaising {

	public static void main(String[] args) {

		double priceCakes = 45;
		double pricеWaffles = 5.80;
		double pricePancakes = 3.20;

		Scanner scan = new Scanner (System.in);
		System.out.println("Please type the number of days:");
		int days = Integer.parseInt(scan.nextLine());
		System.out.println("Please type the number of chefs:");
		int chefs = Integer.parseInt(scan.nextLine());
		System.out.println("Please type the number of cakes per chef:");
		int numberCakesPerChef = Integer.parseInt(scan.nextLine());
		System.out.println("Please type the number of waffles per chef:");
		int numberWafflesPerChef = Integer.parseInt(scan.nextLine());
		System.out.println("Please type the number of pancakes per chef:");
		int numberPancakesPerChef = Integer.parseInt(scan.nextLine());

		double raisedMoney = (7/8)*days*chefs*((numberCakesPerChef*priceCakes) + (numberWafflesPerChef*pricеWaffles) + (numberPancakesPerChef*pricePancakes));

		System.out.printf("The raised money is: %.2f", raisedMoney);
	}
}
