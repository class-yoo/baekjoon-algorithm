package p2021.p06.p18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            long sum = 0;

            for (int j = 1; j < Integer.parseInt(input[0]); j++) {
                for (int k = j+1; k <= Integer.parseInt(input[0]) ; k++) {
                    sum += gcd(Integer.parseInt(input[j]), Integer.parseInt(input[k]));
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }
}
