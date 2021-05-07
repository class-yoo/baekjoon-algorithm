package p2021.p04.p18;

import java.util.Scanner;

public class P1106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();

        int[] dp = new int[c+1];

        for (int i = 1; i <=c; i++) {
            dp[i] = 100 * 1000;
        }

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int customerNumber = sc.nextInt();
            if (dp[customerNumber] != 0) {
                dp[customerNumber] = Math.min(dp[customerNumber], price);
            } else {
                dp[customerNumber] = price;
            }
        }

        for (int i = 2; i <= c; i++) {
            int j = 1;
            int endPoint = i/2 + 1;
            while(j < endPoint) {
                int tempPrice = dp[i-j] + dp[j];
                dp[i] = dp[i] == 100 * 1000 ? tempPrice : Math.min(tempPrice, dp[i]);
                j++;
            }
        }

        System.out.println(dp[c]);
    }
}