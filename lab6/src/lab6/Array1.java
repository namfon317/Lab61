package lab6;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int [] a = new int[7];
		int [] b = new int[7];
		int[]num =new int[10];
		System.out.println("Enter number a :");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Enter number b :");
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}
		System.out.print("Output : ");	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] == b[j]) {
					
					System.out.print(""+b[j]+",");	
					sum = sum+1;
				}
				
			}
				
		}System.out.print("count "+sum);	
	}

}
