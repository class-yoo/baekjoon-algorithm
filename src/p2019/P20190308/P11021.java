package p2019.P20190308;

import java.util.Scanner;

public class P11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int roop = sc.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 1; i < roop+1; i++) {
			a = sc.nextInt();
			b =sc.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}

}
