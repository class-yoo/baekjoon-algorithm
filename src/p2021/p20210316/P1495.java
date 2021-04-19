package p2021.p20210316;

import java.util.Scanner;

public class P1495 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();

		// 모든 곡에 대한 볼륨 DP 배열 [곡의 개수 +1][최대볼륨 +1]
		boolean[][] dp = new boolean[n+1][m + 1];

		dp[0][s] = true; // 초기 볼륨
		
		for (int i = 1; i <= n; i++) {
			int v = sc.nextInt(); // i 번째 볼륨
			for (int j = 0; j <= m; j++) {
				if (dp[i-1][j] == true) { // 이전곡을 j번째 볼륨으로 곡을 실행할 수 있다면
					if (0 <= j - v) dp[i][j-v] = true;
					if (j + v <= m) dp[i][j+v] = true;
				}
			}
		}
		
		int answer = -1;
		
		// 마지막 곡의 가장 큰 볼륨 부터 실행할 수 있는지 체크
		for (int i = m; i >= 0; i--) {
			if (dp[n][i] == true) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
