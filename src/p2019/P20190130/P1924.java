package p2019.P20190130;
import java.util.Scanner;

public class P1924 {

	public static void main(String[] args) {

		int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int totalDays = 0;
		for (int i = 0; i < month - 1; i++) {
			totalDays += arr[i];
		}
		totalDays += day;
		String dayOfWeek = "";
		switch (totalDays % 7) {
		case 1:
			dayOfWeek = "MON";
			break;
		case 2:
			dayOfWeek = "TUE";
			break;
		case 3:
			dayOfWeek = "WED";
			break;
		case 4:
			dayOfWeek = "THU";
			break;
		case 5:
			dayOfWeek = "FRI";
			break;
		case 6:
			dayOfWeek = "SAT";
			break;
		case 0:
			dayOfWeek = "SUN";
			break;
		default:
			break;
		}
		System.out.println(dayOfWeek);

	}
}
