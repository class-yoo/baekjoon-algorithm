package p2021.p02.p20210216;

import java.util.Scanner;

public class P9465 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		
		for (int i = 0; i < roop; i++) {
			int n = sc.nextInt();
			long[][] dp = new long[3][n+1];
			for (int j = 1; j < 3; j++) {
				for (int j2 = 1; j2 < n+1 ; j2++) {
					dp[j][j2] = sc.nextInt();
				}
			}
			
			// 로직구현
			if(n > 1) {
				dp[1][2] = dp[1][2] + dp[2][1];
				dp[2][2] = dp[2][2] + dp[1][1];
			}
			
			for (int j = 3; j < n+1; j++) {
				dp[1][j] = dp[1][j]+ Math.max(dp[2][j-1], dp[2][j-2]);
				dp[2][j] = dp[2][j]+ Math.max(dp[1][j-1], dp[1][j-2]);
			}
			
			System.out.println(Math.max(dp[1][n], dp[2][n]));
		}
		
	}
}
