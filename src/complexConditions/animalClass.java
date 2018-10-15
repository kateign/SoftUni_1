package complexConditions;

import java.util.Scanner;

public class animalClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter an animal: ");
		String animal = scan.nextLine();

		switch (animal) {
		case "dog":
			animal = "mamal";
			break;
		case "crocodile":
			animal = "reptile";
			break;
		case "tortoise":
			animal = "reptile";
			break;
		case "snake":
			animal = "reptile";
			break;
		default:
			animal = "unknown";
		}
		System.out.println(animal);
	}
}
