package p2021.p04.p20210419;

import java.util.Scanner;

public class P2294 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumValue = sc.nextInt();

        int[] dp = new int [sumValue+1];

        for (int i = 1; i <= sumValue; i++) {
            dp[i] = sumValue+1;
        }

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value > sumValue) continue;
            dp[value] = 1;
            for (int j = value+1; j <= sumValue; j++) {
                dp[j] = Math.min(dp[j], dp[j-value] + 1);
            }
        }

        System.out.println(dp[sumValue] == sumValue+1 ? -1 : dp[sumValue]);

    }
}
