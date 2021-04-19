package p2021.p20210418;

import java.util.Scanner;

public class P2293 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumValue = sc.nextInt();

        int[] dp = new int [sumValue+1];

        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            if (value > sumValue) continue;
            dp[value]++;
            for (int j = value + 1; j <= sumValue; j++) {
                if (dp[j - value] > 0) {
                    dp[j] += dp[j - value];
                }
            }
        }

        System.out.println(dp[sumValue]);
    }
}
