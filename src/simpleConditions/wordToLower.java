package simpleConditions;

import java.util.Scanner;

public class wordToLower {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two words: ");

		String word1 = scan.nextLine();
		String word2 = scan.nextLine();

		String word11 = word1.toLowerCase();
		String word22 = word2.toLowerCase();

		if (word11.equals(word22)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("They are not equal!");
		}
	}
}
