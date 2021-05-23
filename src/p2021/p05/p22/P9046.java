package p2021.p05.p22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9046 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char[] charArr = br.readLine().toCharArray();

            int max = 0;
            int[] countArr = new int[26];

            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] != ' ') {
                    countArr[charArr[j] - 'a']++;
                }
            }

            for (int j = 0; j <countArr.length ; j++) {
                max = Math.max(max, countArr[j]);
            }

            int maxCnt = 0;
            int answer = 0;
            for (int j = 0; j < countArr.length; j++) {
                if(max == countArr[j]) {
                    maxCnt++;
                    answer = j;
                    if (maxCnt > 1) break;
                }
            }

            sb.append(maxCnt == 1 ? (char)(answer + 'a') : '?').append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
