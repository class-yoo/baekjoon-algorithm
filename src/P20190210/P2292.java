package P20190210;
import java.util.Scanner;

public class P2292 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int checkNumber = 1, mulNumber = 1, count = 1;
		while (number!=1) {
			if((number > checkNumber && number <=(checkNumber + 6*mulNumber))) {
				count++;
				break;
			}
			checkNumber = checkNumber + 6*mulNumber++;
			count++;
		}
		System.out.println(count);
	}
}
