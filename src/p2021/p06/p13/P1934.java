package p2021.p06.p13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1934 {
    public static int gcd (int num1, int num2) {

        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1%num2);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            int commonDivisor = gcd(num1, num2);
            sb.append((num1 * num2) / commonDivisor + "\n") ;
        }

        System.out.println(sb.toString());

    }
}
