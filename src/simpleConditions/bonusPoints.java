package simpleConditions;

import java.util.Scanner;

public class bonusPoints {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter score: %n");
		
		double score = Double.parseDouble(scan.nextLine());
		double bonusPoints1;
		double bonusPoints2;
		double bonusPoints3;
		
		if (score <=100) {
			bonusPoints1 = 5;
		}else if (score >=1000) {
			bonusPoints1 = score*0.1;
		}else {
			bonusPoints1 = score*0.2;
		}
		
		if (score%2==0) {
			bonusPoints2 = 1;
		}else {
			bonusPoints2 = 0;
		}
		
		if (score%10 == 5) {
			bonusPoints3 = 2;
		} else {
			bonusPoints3 = 0;
		}

		System.out.printf("Bonus score: %.2f%n",bonusPoints1 + bonusPoints2 + bonusPoints3 );
		System.out.printf("Total score: %.2f%n", score + bonusPoints1 + bonusPoints2 + bonusPoints3 );
	}
}
