package p2019.P20190308;

import java.util.Scanner;

public class P2445 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for (int star = 0; star < i+1; star++) {
				System.out.print("*");
			}
			for (int j = 1; j <number-i; j ++) {
				System.out.print("  ");
			}
			for (int star = 0; star < i+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < number; i++) {
			for (int star = 1; star < number-i; star++) {
				System.out.print("*");
			}
			for (int j =0; j < i+1; j ++) {
				System.out.print("  ");
			}
			for (int star = 1; star < number-i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
