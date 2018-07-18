import java.util.Scanner;

public class currentTime{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the timezone offset to GMT: ");

		long offset = input.nextLong();

		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		currentHour += offset % 24;
		if(currentHour < 0){
			currentHour += 24;
		}

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
	}
}