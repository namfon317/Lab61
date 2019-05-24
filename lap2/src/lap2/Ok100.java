package lap2;

import java.util.Scanner;

public class Ok100 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter a : ");
		a= in.nextInt();
		System.out.println("Enter b : ");
		b= in.nextInt();
		System.out.println("Enter c : ");
		c= in.nextInt();
		d =a+b+c;
		if(d<=100) {
			System.out.println("100 OK  ");
		}
	}

}
