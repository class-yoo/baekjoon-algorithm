package p2021.p20210417;

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
                // 추가설명은, 자신이 포함할 수 있는 제곱수를 빼면서 개수를 파악하는것이다.
                // 60의 Four Squares 즉, dp[60]에 들어올 수 있는 후보는
                // dp[59] +1, dp[56] +1, dp[51] +1, dp[44] +1, dp[35] +1, dp[24] + 1, dp [11] + 1 가 있는데,
                // 이런 후보가 나온 이유는, 제곱수의 값을 하나씩 빼면서 확인하면 된다.
                // 후보 중 하나인 p[35] +1 를 보면, (35 + 5 * 5) = 60 즉, 35에서 5의 제곱 수인 25를 더하면 60에 되기때문에 카운트 1증가
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1) ;
            }
        }

        System.out.println(dp[n]);
    }
}
