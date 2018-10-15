package complexConditions;

import java.util.Scanner;

public class comissionSales {

	public static void main(String[] args) {

		double percentSofiaUpTo500 = 5;
		double percentSofiaUpTo1000 = 7;
		double percentSofiaUpTo10000 = 8;
		double percentSofiaAbove10000 = 12;
		double percentVarnaUpTo500 = 4.5;
		double percentVarnaUpTo1000 = 7.5;
		double percentVarnaUpTo10000 = 10;
		double percentVarnaAbove10000 = 13;
		double percentPlovdivUpTo500 = 5.5;
		double percentPlovdivUpTo1000 = 8;
		double percentPlovdivUpTo10000 = 12;
		double percentPlovdivAbove10000 = 14.5;

		Scanner scan = new Scanner (System.in);

		System.out.println("Please write which is the city: ");
		String city = scan.nextLine();
		city = city.toLowerCase();

		System.out.println("Please write sales' equivalent in BGN: ");
		double sales = Double.parseDouble(scan.nextLine());
		double comission = -1;

if (sales < 500 && sales > 0) {
	switch (city) {
	case "sofia":
		comission = percentSofiaUpTo500*0.01*sales;
		break;
	case "varna":
		comission = percentVarnaUpTo500*0.01*sales;
		break;
	case "plovdiv":
		comission = percentPlovdivUpTo500*0.01*sales;
		break;
	}
}
else if (sales >500 && sales <=1000) {
	switch (city) {
	case "sofia":
		comission = percentSofiaUpTo1000*0.01*sales;
		break;
	case "varna":
		comission = percentVarnaUpTo1000*0.01*sales;
		break;
	case "plovdiv":
		comission = percentPlovdivUpTo1000*0.01*sales;
		break;
	}
}
else if (sales >1000 && sales <=10000) {
	switch (city) {
	case "sofia":
		comission = percentSofiaUpTo10000*0.01*sales;
		break;
	case "varna":
		comission = percentVarnaUpTo10000*0.01*sales;
		break;
	case "plovdiv":
		comission = percentPlovdivUpTo10000*0.01*sales;
		break;
	}
}
else if (sales >10000) {
	switch (city) {
	case "sofia":
		comission = percentSofiaAbove10000*0.01*sales;
		break;
	case "varna":
		comission = percentVarnaAbove10000*0.01*sales;
		break;
	case "plovdiv":
		comission = percentPlovdivAbove10000*0.01*sales;
		break;
	}
}
		if (comission != -1) {
			System.out.printf("Comission equals %.2f BGN", comission);
		} else {
			System.out.println("Error!");

		}
	}
}
