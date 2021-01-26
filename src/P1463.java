import java.util.Scanner;// ¾È¼º°ø

public class P1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int calCount = 0;

		while (number != 1) {
			if (number >= 3) {
				if (number % 3 != 0) number--;
				else number /= 3;
				calCount++;
			} else {
				number--;
				calCount++;
			}
		}
		System.out.println(calCount);
	}
}