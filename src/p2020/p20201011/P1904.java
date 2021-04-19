package p2020.p20201011;

import java.util.Scanner;

public class P1904 {

	public static int concatNumber(int prefix, int suffix, int N) {
		int tempTile = prefix + suffix;
		if (String.valueOf(tempTile).length() > N)
			return 0;
		if (String.valueOf(tempTile).length() == N)
			return 1;

		return concatNumber(tempTile * 10, 1, N) + concatNumber(tempTile * 100, 22, N);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(15746 % (concatNumber(0, 1, N) + concatNumber(0, 22, N)));

	}
}
