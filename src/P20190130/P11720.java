package P20190130;
import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberCount = sc.nextInt();
		String number[] = sc.next().split("");
		int sum = 0;
		for (int i = 0; i < numberCount; i++) {
			sum += Integer.parseInt(number[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}
