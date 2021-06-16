package p2021.p06.p17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] numbers = br.readLine().split(" ");
            long num1 = Integer.parseInt(numbers[0]);
            long num2 = Integer.parseInt(numbers[1]);
            long minCommonDivisor = gcd(num1, num2);
            sb.append((num1 * num2) / minCommonDivisor).append("\n");
        }

        System.out.println(sb.toString());

    }

    public static long gcd(long num1, long num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1%num2);
        }
    }
}
