package QA_Practise;

public class Polymorphism {
	int hours;
	int minutes;
	int seconds;
	
	public Polymorphism(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		System.out.println("Time: " + hours +":"+minutes + ":"+seconds);
	}
	
	//method overloading
	public void generateTime(int hours) {
		System.out.format("Hours: " + "%02d\n", hours);
	}
	
	public void generateTime(int hours, int minutes) {
		System.out.format("Hours:Minutes " +"%02d:%02d\n", hours, minutes);
	}
	
	public void generateTime(int hours, int minutes, int seconds) {
		System.out.format("Hours:Minutes:Seconds " +"%02d:%02d:%02d\n", hours, minutes, seconds);
	}
	
}
