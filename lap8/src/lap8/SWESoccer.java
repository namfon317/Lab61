package lap8;

import java.util.Scanner;
public class SWESoccer{
public static void main(String[] args) {
	SoccerPlayer n[] = new SoccerPlayer[12];
	
	n[0] = new Forward("name1",22);
	n[1] = new Forward("name2",22);
	n[2] = new Forward("name3",22);
	n[3] = new Forward("name4",22);
	n[4] = new Forward("name5",33);
	n[5] = new Forward("name6",33);
	n[6] = new Forward("name7",33);
	n[7] = new Forward("name8",33);
	n[8] = new Forward("name9",20);
	n[9] = new Forward("name10",20);
	n[10] = new Forward("name11",20);
	n[11] = new Forward("name12",20);
	
	showAllPlayer(n);
}

public static void showAllPlayer(SoccerPlayer n[]){
	for(int i = 0; i < n.length;i++){
		if(i == 0){
			System.out.println("Forward: ");
		}
		else if(i == 4){
			System.out.println("Midfield: ");
		}
		else if(i == 8){
			System.out.println("Defense: ");
		}
		else if(i == 10){
			System.out.println("Goalkeeper: ");
		}
		else if(i == 11){
			System.out.println("Reserve: ");
		}
		System.out.println(i+". "+n[i].toString());
	}
}
}
