package p2021.p05.p22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9046_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int max = 0;
            char maxAlphabet = '?';
            int[] countArr = new int[26];

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) != ' ') {
                    int tempIdx = ++countArr[input.charAt(j) - 'a'];
                    if (max < tempIdx) {
                        max = tempIdx;
                        maxAlphabet = input.charAt(j);
                    } else if (max == tempIdx) {
                        maxAlphabet = '?';
                    }
                }
            }

            sb.append(maxAlphabet).append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
