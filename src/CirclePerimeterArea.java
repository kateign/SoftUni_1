import java.util.Scanner;

public class CirclePerimeterArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.printf("Please write the radius of the circle in [mm]: %n");
		int r = Integer.parseInt(scan.nextLine());
		System.out.printf("PI equals %.2f. %n",(Math.PI));
		System.out.printf("The perimeter equals %.2f mm. %n",(Math.PI*2*r));
		System.out.printf("The area equals %.2f mm. %n",(Math.pow(r, 2)*Math.PI));
	}
}
