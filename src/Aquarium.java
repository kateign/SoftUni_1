import java.util.Scanner;

public class Aquarium {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Please write the length of the aquarium in [cm]:");
		double length = Double.parseDouble(scan.nextLine());
//		System.out.println("Please write the width of the aquarium in [cm]:");
		double width = Double.parseDouble(scan.nextLine());
//		System.out.println("Please write the height of the aquarium in [cm]:");
		double height = Double.parseDouble(scan.nextLine());
//		System.out.println("Please write the percent that is full with sand, plants, pump, heater, etc:");
		//Why if int otherThanWater = Integer.parseInt(scan.nextLine()); then realVolumeLitres = 0
		int otherThanWater = Integer.parseInt(scan.nextLine());

		double volumeLitres = (length/10)*(width/10)*(height/10);
		double realVolumeLitres = volumeLitres*(100-otherThanWater)/100;
		
		System.out.printf("%.3f", realVolumeLitres);
		
	}
}
