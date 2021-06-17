package p2021.p06.p17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            long number = Long.parseLong(br.readLine());
            for (long j = number; true; j++) {
                if (isPrimeNumber(j)) {
                    sb.append(j).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean isPrimeNumber(long n) {
        if (n == 0 || n == 1) return false;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
