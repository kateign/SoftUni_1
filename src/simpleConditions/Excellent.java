package simpleConditions;

import java.util.Scanner;

public class Excellent {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Please write the grade: ");
			double grade = Double.parseDouble(scan.nextLine());

			if (grade >= 5.5 && grade <=6.0) { System.out.println("Excellent!");
			}else if ( grade >=2.0 && grade <=5.5){
				System.out.println("Not excellent!");
			}else if (grade <2.0 || grade >6.0) {
				System.out.println("Please write a grade from 2.00 to 6.00!");
			}else {
				System.out.println("Bye!");
			}
			}while(true);
}
}
