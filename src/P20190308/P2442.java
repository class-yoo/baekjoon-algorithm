package P20190308;

import java.util.Scanner;

public class P2442 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		String star = "*";
		for (int i = 0; i < number; i++) {
			for(int j=1; j<number-i; j++) {
				System.out.print(" ");
			}
			System.out.println(star);
			star +="**";
		}
		sc.close();
	}
}
