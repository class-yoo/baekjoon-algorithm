package P20190308;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int roop = sc.nextInt();
		String numbers [];
		for (int i = 0; i < roop; i++) {
			numbers =sc.next().split(",");
			
			System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
		}

	}
}
