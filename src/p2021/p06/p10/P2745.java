package p2021.p06.p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String encodingNum = input[0];
        int num = Integer.parseInt(input[1]);
        int mulNum = 1;
        int total = 0;

        for (int i = encodingNum.length() - 1; i >= 0; i--) {
            int temp = 0;
            if (encodingNum.charAt(i) >= 'A') {
                temp = 10 + encodingNum.charAt(i) - 'A';
            } else {
                temp = encodingNum.charAt(i) - '0';
            }

            total += temp * mulNum;
            mulNum *= num;
        }

        System.out.println(total);
    }
}
