package lap2;

import java.util.Scanner;

public class More50 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a : ");
		a= in.nextInt();
		System.out.println("Enter b : ");
		b= in.nextInt();
		c =a+b;
		if(c>50) {
			System.out.println("More 50 ");
		}
		
	}

}
