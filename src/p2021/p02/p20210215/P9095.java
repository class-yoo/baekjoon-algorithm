package p2021.p02.p20210215;

import java.util.Scanner;

public class P9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int[] dp = new int[num];
			
			dp[0] = 1;
			if (num > 1) dp[1] = 2;
			if (num > 2) dp[2] = 4;
			
			for (int j = 3; j < num; j++) {
				dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
			}
			System.out.println(dp[num-1]);
		}
	}
}