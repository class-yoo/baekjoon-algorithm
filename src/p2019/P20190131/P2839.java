package p2019.P20190131;
import java.util.Scanner;

public class P2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int five = 0;
		int three = 0;
		int total = 0;
		if (number % 5 == 0) {
			total = number / 5;
		} else {
			for (five = 0; five * 5 < number; five++) {
				int check = (number - five * 5);
				if ((check <= 12 && check >= 3) && check % 3 == 0) {
					three = check / 3;
					total = five + three;
					break;
				}
			}
			if(five*5>number) total=-1;
		}
		System.out.println(total);
	}
}
