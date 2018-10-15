package simpleConditions;

import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		do{
			System.out.println("Please type a number: ");
		
		int number = Integer.parseInt(scan.nextLine());
		boolean even = number%2 == 0;

		if (even ==true) {
			System.out.println("The number is even!");
		}else {
			System.out.println("The number is odd!");
		}
		}while (true);
		
	}
}
