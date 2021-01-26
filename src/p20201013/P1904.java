package p20201013;

import java.util.Scanner;

public class P1904 {

	public static int concatNumber(int prefix, int sufix, int N) {
		int tempTile = prefix + sufix;
		if (String.valueOf(tempTile).length() > N)
			return 0;
		if (String.valueOf(tempTile).length() == N)
			return 1;

		return concatNumber(tempTile * 10, 1, N) + concatNumber(tempTile * 100, 22, N);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println((concatNumber(0, 1, N) + concatNumber(0, 22, N)) % 15746);
	}
}
