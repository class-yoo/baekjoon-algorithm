package p20210316;

import java.util.Scanner;

public class P1495 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();

		boolean[][] dp = new boolean[n+1][m + 1];

		dp[0][s] = true;
		
		for (int i = 1; i <= n; i++) {
			int v = sc.nextInt();
			for (int j = 0; j <= m; j++) {
				if (dp[i-1][j] == true) {
					if (0 <= j - v) dp[i][j-v] = true;
					if (j + v <= m) dp[i][j+v] = true;
				}
			}
		}
		
		int answer = -1;
		
		for (int i = 0; i <= m; i++) {
			if (dp[n][i] == true) answer = i;
		}
		
		System.out.println(answer);
	}
}
