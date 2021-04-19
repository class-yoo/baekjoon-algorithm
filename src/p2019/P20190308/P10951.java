package p2019.P20190308;

import java.util.Scanner;

public class P10951 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0) break;
			System.out.println(a+b);
		}

	}
}
