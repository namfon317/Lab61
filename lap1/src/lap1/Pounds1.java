package lap1;
import java.util.Scanner;
public class Pounds1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double p = input.nextDouble();
		
		double kgs = p * 0.454;
		System.out.print("pounds is " + kgs + " kgs");
	}
}

