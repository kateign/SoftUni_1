import java.util.Scanner;

public class ConvertCurrency {

	public static void main(String[] args) {

		double convertToUSD = 1.79549;
		double convertToEUR = 1.95583;
		double convertToGBP = 2.53405;
		String currency;
		double leva;
		boolean amISmart = true;
		Scanner scan = new Scanner (System.in);

		myOuterLoop: do {
			System.out.printf("(If you want to stop the application, please type \"END\")%n");
			System.out.printf("Please type the amount of money in leva: %n");
			String reply = scan.nextLine();
			if (reply.equals("END")) {
				break myOuterLoop;
			}
			leva = Double.parseDouble(reply);
			System.out.println("Please choose the currency you want to convert the money into. Type one of the options: USD,EUR or GBP");
			currency = scan.nextLine();
			if (currency.equals("USD")) {
				double resultUSD = leva*convertToUSD;
				System.out.printf("%f BGN = %f %s %n",leva,resultUSD,currency);
			}else if (currency.equals("EUR")) {
				double resultEUR = leva*convertToEUR;
				System.out.printf("%f BGN = %f %s %n", leva,resultEUR,currency);			
			}else if (currency.equals("GBP")){
				double resultGBP = leva*convertToGBP;
				System.out.printf("%f BGN = %f %s %n", leva,resultGBP,currency);	
			}
		}while (5 == 5);	
		System.out.printf("Bye!");
	}
}
