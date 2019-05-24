package lap3;

import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Bank1000, Bank500, Bank100, Bank50 = 0, Bank20, Coin;
		
		
		System.out.println(" Enter amount of money : ");
		Coin= in.nextInt();
		
		if(Coin<=20000) {
		Bank1000 = Coin/1000;
		Coin = Coin-(Bank1000*1000);
		System.out.println("1000 Bahts : " +Bank1000);
		
		Bank500 = Coin/500;
		Coin = Coin-(Bank500*500);
		System.out.println("500 Bahts : " +Bank500);
		
		Bank100 = Coin/100;
		Coin = Coin-(Bank100*100);
		System.out.println("100 Bahts : " +Bank100);
		}
		else if(Coin>=20000) {
			System.out.println("You can’t withdraw money more than 20000 Bahts" );
		}
		
	}

}