package complexConditions;

import java.util.Scanner;

public class dotInRectangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Please write the values of x1,x2,y1,y2,x,y: ");

		double x1 = Double.parseDouble(scan.nextLine());
		double y1 = Double.parseDouble(scan.nextLine());
		double x2 = Double.parseDouble(scan.nextLine());
		double y2 = Double.parseDouble(scan.nextLine());
		double x = Double.parseDouble(scan.nextLine());
		double y = Double.parseDouble(scan.nextLine());

		if ((x > x1 && x < x2) && (y > y1 && y < y2)) {
			System.out.print("Inside");
		}else if ((x < x1 || x > x2 || y <= y1 || y >= y2 )){
			System.out.print("Outside");
		}else if ((x == x1 || x == x2) && (y >= y1 && y <= y2)){
			System.out.print("Boarder");
		}else if ((y == y1 || y == y2) && (x >= x1 && x <= x2)){
			System.out.print("Boarder");
		}
	}

}
