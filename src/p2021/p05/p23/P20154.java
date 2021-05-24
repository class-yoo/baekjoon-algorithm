package p2021.p05.p23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P20154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        int[] table = {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        int[] sumArr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            sumArr[i] = table[input.charAt(i) - 'A'];
        }

        int idx = 1;

        while (idx < input.length()) {
            for (int i = 0; i+idx < input.length(); i++) {
                int sum = sumArr[i] + sumArr[i + idx];
                sumArr[i] = sum > 10 ? sum % 10 : sum;
            }
            idx *= 2;
        }

        System.out.println(sumArr[0] % 2 == 1 ? "I'm a winner!" : "You're the winner?");
    }
}
