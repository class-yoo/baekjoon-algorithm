package p2021.p06.p14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int minPrimeNumber = 0;

        for (int i = M; i <= N; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
                if (minPrimeNumber == 0) {
                    minPrimeNumber =  i;
                }
            }
        }

        if (minPrimeNumber == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println(minPrimeNumber);
    }

    public static boolean isPrimeNumber (int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
