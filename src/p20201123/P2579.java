package p20201123;

import java.util.Scanner;

public class P2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = dp[1] = arr[1];
		
		if (n > 2) max = dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= n; i++) {
			dp[i] = arr[i] + Math.max(arr[i-1] + dp[i-3], dp[i-2]);
			
			dp[i] = Math.max(dp[i], dp[i-1]);
		}
		
		System.out.println(max);
	}
}

