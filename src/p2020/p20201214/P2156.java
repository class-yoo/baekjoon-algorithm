package p2020.p20201214;

import java.util.Scanner;

public class P2156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N + 1];
		int dp[] = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = dp[1] = arr[1];
		
		if (N > 2) max = dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= N; i++) {
			dp[i] = arr[i] + Math.max(arr[i - 1] + dp[i - 3], dp[i - 2]);
			max = Math.max(dp[i], max);
		}
		
		System.out.println(max);
	}
}
