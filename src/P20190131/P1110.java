package P20190131;
import java.util.Scanner;

public class P1110 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int tencePlace = 0;
		int unitsPlace = 0;
		int sum = 0;
		int newNumber = number;
		int count = 0;

		while (true) {
			tencePlace = newNumber / 10;
			unitsPlace = newNumber % 10;
			sum = tencePlace + unitsPlace;
			newNumber = unitsPlace * 10 + sum % 10;
			count++;
			if (newNumber == number) break;
		}
		System.out.println(count);
		sc.close();
	}
}