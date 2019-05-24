package lap11;

public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	 public Date(){
	 this.dMonth = dMonth;
	 this.dDay = dDay;
	 this.dYear = dYear;
	 }
	public Date(int month, int day, int year){
		 this.dMonth = month;
		 this.dDay = day;
		 this.dYear = year;
	 }

	public void setDate(int month, int day, int year){
		this.dDay = day;
		this.dMonth = month;
		this.dYear = year;

	 }
	public int getMonth() {
	 return dMonth;
	}
	public int getDay(){
	 return dDay;
	}
	public int getYear(){
	 return dYear;
	}
	public String toString(){
	 return (dMonth + "-" + dDay + "-" + dYear);
	}
}



