package lap3;
import java.util.Scanner;
public class Char {
	
		public static void main(String[] args) {
			char x;
			String type = null;
			
			Scanner sb = new Scanner(System.in);
			
			System.out.print("Any character : ");
			x = sb.next().charAt(0);
			
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
				type = "Vowel";
			}
			else if(x >= 'a' && x <= 'z'){
				type = "consonant";
			}
			else if(x >= '1' && x <= '9'){
				type = "number";
			}
			else
				type = "Special character";
			
			System.out.println(""+x+" is a "+type);
	}

}
