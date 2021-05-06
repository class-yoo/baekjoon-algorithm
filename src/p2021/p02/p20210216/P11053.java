package p2021.p02.p20210216;

import java.util.Scanner;

public class P11053 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
		}

		int max = 1;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}
}
