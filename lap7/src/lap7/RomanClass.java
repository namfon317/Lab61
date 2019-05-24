package lap7;

public class RomanClass {
	String roman;
	static int num;
	
	public RomanClass() {
	}
	public RomanClass(String r) {
		this.roman =r;
	}
	
	public int checkRoman(String roman) {
		int l=  roman.length();
        int num1=0;
        int previousnum = 0;
         
		for (int i=l-1;i>=0;i--)
        { 
                char x =  roman.charAt(i);
                x = Character.toUpperCase(x);
                switch(x)
                {  
                     case 'I': previousnum = num; num = 1;break;
                     case 'V':previousnum = num;num = 5;break;
                     case 'X':previousnum = num;num = 10;break;
                     case 'L':previousnum = num;num = 50; break;
                     case 'C':previousnum = num;num = 100;break;
                     case 'D':previousnum = num;num = 500;break;
                     case 'M':previousnum = num;num = 1000;break;
                }           
                if (num<previousnum)
                {num= num-num1;}
                 else
                	 num= num+num1;
        }
		return num;
}
	}

