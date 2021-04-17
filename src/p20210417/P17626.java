package p20210417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[1] = 1;

        for (int i = 2; i <=n ; i++) {
            dp[i] = 50000; // 가장 큰수 세팅
            for (int j = 1; j * j <= i ; j++) {
                // 예를들어 i가 8이면 dp[8 - 1*1] + 1 / dp[8 - 2*2] +1 = dp[7] + 1 와 dp[4] +1 중 더 작은 수를 세팅함
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1) ;
            }
        }

        System.out.println(dp[n]);
    }
}
