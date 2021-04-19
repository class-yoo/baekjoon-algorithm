package p2020.p20201014;

import java.util.Scanner;

public class P12866_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int dp[][] = new int[N + 1][K + 1];

		for (int i = 1; i < N + 1; i++) {
			int W = sc.nextInt();
			int V = sc.nextInt();
			for (int j = 1; j < K + 1; j++) {
				if (j < W) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W] + V);
				}
			}
		}

		System.out.println(dp[N][K]);

	}

}
