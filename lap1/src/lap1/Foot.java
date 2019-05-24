package lap1;
import java.util.Scanner;
public class Foot {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double m = 0.305;

			System.out.print("Enter a value for feet: ");
			double feet = input.nextDouble();
			double meters = feet * m;
			System.out.println("feet is " + meters + " meters");
		}
	}


