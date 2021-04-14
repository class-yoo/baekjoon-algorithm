package p20210413;

import java.util.Scanner;

public class P10870 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();

        int[][] dp = new int [30][30];

        for (int i = 0; i < dp.length ; i++) {
            dp[0][i] = i+1;
        }

        for (int i = 1; i < dp.length ; i++) {
            for (int j = i; j < dp.length ; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i][j-1];
            }
        }

        for (int i = 0; i < loop; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(dp[n-1][m-1]);
        }
    }
}