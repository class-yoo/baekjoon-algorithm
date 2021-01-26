package p20201016;

import java.util.Arrays;
import java.util.Scanner;

public class P11053 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int numberArr[] = new int[N];
		int dp[] = new int[N];

		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = sc.nextInt();
			dp[i] = 1;
		}

		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {
				if (numberArr[j] < numberArr[i]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
				}
			}
		}

		Arrays.sort(dp);
		System.out.println(dp[dp.length - 1]);

	}
}
