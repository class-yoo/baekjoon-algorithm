package p2019.P20190308;

import java.util.Scanner;

public class P2441 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		String empty = "";
		for (int i = 0; i < number; i++) {
			System.out.print(empty);
			for (int j = 0; j < number - i; j++) {
				System.out.print("*");
			}
			System.out.println();
			empty+=" ";
		}
		sc.close();
	}
}