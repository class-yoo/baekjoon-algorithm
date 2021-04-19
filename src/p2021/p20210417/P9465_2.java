package p2021.p20210417;

import java.util.Scanner;

public class P9465_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        for (int i = 0; i < loop; i++) {
            int length = sc.nextInt();

            int[][] arr = new int [2][length+1];
            int[][] dp = new int [2][length+1];
            for (int j = 0; j < 2 ; j++) {
                for (int k = 1; k <= length; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            dp[0][1] = arr[0][1];
            dp[1][1] = arr[1][1];

            int max = Math.max(dp[0][1], dp[1][1]);

            for (int j = 2; j <= length; j++) {
                dp[0][j] = arr[0][j] + Math.max(dp[1][j-1], dp[1][j-2]);
                dp[1][j] = arr[1][j] + Math.max(dp[0][j-1], dp[0][j-2]);
            }

            System.out.println(Math.max(dp[0][length], dp[1][length]));
        }
    }
}
