package p2020.p20201206;

import java.util.Scanner;

public class P15486 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n + 1][2];

		for (int i = 1; i <= n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			int tempTotal = 0;
			for (int j = i; j <= n; j++) {
				if (j + arr[j][0] - 1 <= n) {
					tempTotal += arr[j][1];
					j += arr[j][0] - 1;
				}
			}

			max = Math.max(max, tempTotal);
		}
		
		System.out.println(max);

	}
}
