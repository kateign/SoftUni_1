import java.util.Scanner;

public class DancingRoom {

	public static void main(String[] args) {
		
		double areaDancerCM = 40;
		double areaDancerMovementCM = 7000;
		double areaPerDancerCM = areaDancerCM + areaDancerMovementCM;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please type the lengths of the hall in [m]");
		double lengthHall = 100*Double.parseDouble(scan.nextLine());
		System.out.println("Please type the width of the hall in [m]");
		double widthHall = 100*Double.parseDouble(scan.nextLine());
		System.out.println("Please type the width of the wardrobe in [m]");
		double widthWardrobe = 100*Double.parseDouble(scan.nextLine());
		
		
		double hallArea = lengthHall * widthHall;
		double bendgeArea = hallArea / 10;
		double wardrobeArea = widthWardrobe * widthWardrobe;
		double DancingArea =  hallArea - bendgeArea - wardrobeArea;
		double numberDancers = Math.floor(DancingArea / areaPerDancerCM);
		
		System.out.println(numberDancers);
		
		
		
		
		
		
		
		
		
		
	}

}
