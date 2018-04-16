import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/15/2018
*/

public class P2_AreaComputer {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What are the lengths of the three sides of your triangle?");
		double sideone = console.nextDouble();
		double sidetwo = console.nextDouble();
		double sidethree = console.nextDouble();
		System.out.print("Your area is " + triangleArea(sideone, sidetwo, sidethree));
		console.close();
	}
	
	public static double triangleArea(double sideone, double sidetwo, double sidethree) {
		double s = (sideone + sidetwo + sidethree) / 2;
		return Math.sqrt(s * (s - sideone) * (s - sidetwo) * (s - sidethree));
	}

}
