package p2019.P20190309;

import java.util.Scanner;

public class P10992 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append("*");
		
		for (int i = 0; i < number-1; i++) {
			for (int empty =0; empty < number-i-1; empty++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int empty =0; empty < i*2-1; empty++) {
				System.out.print(" ");
			}
			if(i>0) System.out.print("*");
			System.out.println();
			sb.append("**");
		}
		System.out.println(sb.toString());
		sc.close();

	}
}
