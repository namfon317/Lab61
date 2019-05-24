package lap11;

public class TestPersonalInfo {
	public static void main(String[] args) {
		PersonalInfo[] p = new PersonalInfo[2];
		p[0] = new PersonalInfo();
		p[0].setPersonalInfo("sirirat", "wichityaem", 7, 7, 1998, 60144235);
		p[1].setPersonalInfo("sirirat2", "wichityaem", 7, 7, 1998, 60144235);
		p[2].setPersonalInfo("sirirat2", "wichityaem", 7, 7, 1998, 60144235);
		
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]);	
		}
		
	}
} 