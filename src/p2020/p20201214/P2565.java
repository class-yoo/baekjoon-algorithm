package p2020.p20201214;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P2565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] wire = new int[N][2];
		int[] dp = new int[N];
		
		for (int i = 0; i < dp.length; i++) {
			wire[i][0] = sc.nextInt();
			wire[i][1] = sc.nextInt();
		}

		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int max = 0;
		for (int i = 0; i < wire.length; i++) {
			dp[i] = 1;
			// 자신과 겹치지 않는 이전의 와이어 중에서 가장 많은 카운트를 가지고 있는 와이어 +1
			for (int j = 0; j < i; j++) {
				if (wire[j][1] < wire[i][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);
		}

		System.out.println(N - max);
	}
}
