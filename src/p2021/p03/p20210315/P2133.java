package p2021.p03.p20210315;

import java.util.Scanner;

public class P2133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] dp = new int[n + 1];

		dp[0] = 1;

		if (n > 1)
			dp[2] = 3;

		for (int i = 4; i <= n; i += 2) {
			dp[i] = dp[i - 2] * 3;

			for (int j = 4; j <= i; j += 2) {
				dp[i] += dp[i - j] * 2;
			}
		}

		System.out.println(dp[n]);

	}
}
