package p2021.p02.p20210216;

import java.util.Scanner;

public class P11055 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dp[i] = arr[i];
		}

		int max = dp[0];
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					dp[i] = Math.max(dp[i], arr[i] + dp[j]);
				}
			}
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}
}
