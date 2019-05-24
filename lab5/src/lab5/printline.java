package lab5;

import java.util.Scanner;

public class printline {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c;
		int n;
		System.out.print("Enter a number : ");
		n= in.nextInt();
		System.out.print("Enter a character : ");
		c=in.next().charAt(0);
		print_line(c,n);
	}
	public static void print_line(char c, int n) {
		for(int i = 1; i<=n; i++){
			System.out.print(" "+c);
			
			
		}
	}
		
	

}
