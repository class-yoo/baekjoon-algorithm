package p2021.p20210216;

import java.util.Scanner;

public class P11722 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			dp1[i] = dp2[i] = 1;
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) dp1[i] = Math.max(dp1[i], dp1[j] + 1);
				if (arr[n-i-1] > arr[n-j-1]) dp2[n-i-1] = Math.max(dp2[n-i-1], dp2[n-j-1] + 1);
			}
		}
		
		int max = 1;
		for (int i = 1; i < n; i++) max = Math.max(max, dp2[i] + dp1[i] -1);
		System.out.println(max);
	}
}
