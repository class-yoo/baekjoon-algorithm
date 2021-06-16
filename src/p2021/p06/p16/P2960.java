package p2021.p06.p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");

        int[] arr = new int[Integer.parseInt(numbers[0]) + 1];
        int K = Integer.parseInt(numbers[1]);
        int number = 2;

        while (K > 0) {
            if (isPrimeNumber(number)) {
                for (int i = 1; i * number < arr.length; i++) {
                    if (arr[i * number] == 0) {
                        arr[i * number] = 1;
                        K--;

                        if (K == 0) {
                            System.out.println(i * number);
                            return;
                        }
                    }
                }
            }

            number++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
