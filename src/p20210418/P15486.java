package p20210418;

import java.util.Scanner;

public class P15486 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n+1];
        int[] dp = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            int endDay = i + arr[0][i]-1;
            if (endDay <= n) {
                dp[endDay] = Math.max(dp[i-1]+arr[1][i], dp[endDay]);
            }

            dp[i] = Math.max(dp[i], dp[i-1]);
        }

        System.out.println(dp[n]);
    }
}