package p2021.p06.p22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(true) {
            if (isPrimeNumber(N)) {
                if (isPalindromeNumber(N)) {
                    System.out.println(N);
                    return;
                }
            }
            N++;
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindromeNumber(int num) {
        String tempNum = String.valueOf(num);
        for (int i = 0; i <= tempNum.length() / 2; i++) {
            if (tempNum.charAt(i) != tempNum.charAt(tempNum.length() - i -1)) {
                return false;
            }
        }

        return true;
    }

}
