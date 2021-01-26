package P20190309;

import java.util.Scanner;

public class P10991 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("*");
		for (int i = 0; i < number; i++) {
			for (int empty = 1; empty < number-i; empty++) {
				System.out.print(" ");
			}
			System.out.println(sb.toString());
			sb.append(" *");
		}
		sc.close();

	}
}
