package lap4;
import java.util.Scanner;
public class Num9999 {
		public static void main (String[] agrs) {
			Scanner in = new Scanner(System.in);
			int num = 0,num1,i=0;
			double totle=0,totle1=0;
			do {
				System.out.println("Enter number : "); 
				num= in.nextInt();
		          if (num != 9999) {
		                  i++;
		                  totle1 += num;
		          }
		      } while (num != 9999);
			totle=totle1/i;
			System.out.println(totle);
		}
}


