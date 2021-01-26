package P20190309;

import java.util.Scanner;

public class P2522 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			for (int empty = 0; empty < i; empty++) {
				System.out.print(" ");
			}
			for (int j = 1; j <number*2-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < number; i++) {
			for (int empty = 1; empty < number-i; empty++) {
				System.out.print(" ");
			}
			for (int j = 0; j <i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
