package complexConditions;

import java.util.Scanner;

public class MrMsMrsMaster {

	public static void main(String[] args) { 
		Scanner scan = new Scanner (System.in);
		System.out.println("Please write which is your gender (male - m or female - f)");
		String gender = scan.nextLine();
		System.out.println("Please write your age: ");
		double age = Integer.parseInt(scan.nextLine());

		if (gender.equals("f")) {
			if (age>=18) {
				System.out.println("Mrs");
			}else {
				System.out.println("Ms");
			}
		} else {
			if (age>=18) {
				System.out.println("Mr");
			} else {
				System.out.println("Master");
			}
		}
	}
}
