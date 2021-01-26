package P20190308;

import java.util.Scanner;

public class P2438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		String star = "*";
		for (int i = 0; i < number; i++) {
			System.out.println(star);
			star+="*";
		}
		sc.close();
	}
}
