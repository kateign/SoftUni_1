package simpleConditions;

import java.util.Scanner;

public class scholarship {

	public static void main(String[] args) {

		double excellentGrade = 5.5;
		double minGradeSocialScholarship = 4.5;
		double coefExcellenceScholarship = 25;
		double coefSocialScholarship = 0.35;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the income per member of your family: ");
		double incomePerFamilyMember = Double.parseDouble(scan.nextLine());
		System.out.println("Please enter the grade of the student: ");
		double studentGrade = Double.parseDouble(scan.nextLine());
		System.out.println("Please enter the minimal month wage: ");
		double minWage = Double.parseDouble(scan.nextLine());
		double excellenceScholarship = 0;
		double socialScholarship = 0;

		if (studentGrade >= excellentGrade) {
			excellenceScholarship = studentGrade*coefExcellenceScholarship;
		}
		
		if (studentGrade >= minGradeSocialScholarship && incomePerFamilyMember < minWage) {
			socialScholarship = minWage*coefSocialScholarship;
		}
		
		if (excellenceScholarship == 0 || socialScholarship == 0) {
			System.out.printf("You cannot get a scholarship.");
		} else if (excellenceScholarship > socialScholarship) {
			System.out.printf("You get a scholarship for excellent results: %.2f BGN", excellenceScholarship);
		} else if (excellenceScholarship < socialScholarship) {
			System.out.printf("You get a socail scholarship: %.2f BGN", socialScholarship);
		} else if (studentGrade < minGradeSocialScholarship) {
			System.out.printf("You cannot get a scholarship.");
		} else {
			System.out.printf("You cannot get a scholarship.");
		}
	}
}
