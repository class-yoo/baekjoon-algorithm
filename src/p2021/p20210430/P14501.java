package p2021.p20210430;

import java.util.Scanner;

public class P14501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] p = new int[n+1];
        int[] dp = new int [n+1];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            if (i+t[i]-1 <= n) {
                dp[i+t[i]-1] = Math.max(dp[i-1] + p[i], dp[i+t[i]-1]);
                max = Math.max(dp[i+t[i]-1], max);
            }
            
            dp[i] = Math.max(dp[i], dp[i-1]);
        }

        System.out.println(max);
    }
}
