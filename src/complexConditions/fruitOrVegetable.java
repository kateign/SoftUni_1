package complexConditions;

import java.util.Scanner;

public class fruitOrVegetable {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please write a product: ");

		String product = scan.nextLine();
		product = product.toLowerCase();


		switch (product) {
		case "banana": 
		case "apple": 
		case "kiwi": 
		case "cherry": 
		case "lemon": 
		case "grapes": product = "fruit"; break;
		case "tomato":
		case "cucumber":
		case "pepper":
		case "carrot": product = "vegetable"; break;
		default: product = "Unknown";
		}
		System.out.println(product);
	}
}

