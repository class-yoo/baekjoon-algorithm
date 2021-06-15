package p2021.p06.p15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (N == 1) return;

        while (N != 1) {
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    if (isPrimeNumber(i)) {
                        N /= i;
                        sb.append(i).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }


    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
