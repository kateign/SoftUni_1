import java.util.Scanner;

public class TableCloths {

	public static void main(String[] args) {
		int PriceOneTableClothUSD = 7;
		int PriceOneTableCoverUSD = 9;
		double usdTobgn = 1.85;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the number of tables:");
		int numberOfTables = Integer.parseInt(scan.nextLine());
		System.out.println("Please type the length of the tables in [m]:");
		double lengthOfTables = Double.parseDouble(scan.nextLine());
		System.out.println("Please type the width of the tables in [m]:");
		double widthOfTables = Double.parseDouble(scan.nextLine());

		double areaOfTableCloths = (lengthOfTables+2*0.3)*(widthOfTables+2*0.3);
		double areaOfTableCovers = (lengthOfTables/2)*(lengthOfTables/2);

		double priceTableClothsUSD = areaOfTableCloths*numberOfTables*PriceOneTableClothUSD;
		double priceTableClothsBGN = priceTableClothsUSD*usdTobgn;
		double priceTableCoversUSD = areaOfTableCovers*numberOfTables*PriceOneTableCoverUSD;
		double priceTableCoversBGN = priceTableCoversUSD*usdTobgn;

		double priceAllUSD = priceTableClothsUSD + priceTableCoversUSD;
		double priceAllBGN = priceTableClothsBGN + priceTableCoversBGN;

		System.out.printf("%.2f USD%n", priceAllUSD);
		System.out.printf("%.2f BGN", priceAllBGN);






	}

}
