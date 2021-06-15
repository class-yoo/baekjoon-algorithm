package p2021.p06.p15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            if (isPrimeNumber(Integer.parseInt(numbers[i]))) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean isPrimeNumber (int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
