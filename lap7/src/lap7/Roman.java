package lap7;

import java.util.Scanner;

public class Roman {
        static String num;
        public static void main(String args[]) {
        	RomanClass rmtoD = new RomanClass();
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a Roman number: ");
                num = scan.nextLine();
                num = num.toUpperCase();
                rmtoD.checkRoman(num);
                System.out.println ("Roman numeral "+num+" is "+rmtoD.checkRoman(num));
            
        }
   
        
}