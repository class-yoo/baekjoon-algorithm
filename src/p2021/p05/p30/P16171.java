package p2021.p05.p30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String K = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if ('a' <= S.charAt(i)  && 'z' >= S.charAt(i)){
                sb.append(S.charAt(i));
                continue;
            }

            if ('A' <= S.charAt(i)  && 'Z' >= S.charAt(i)) {
                sb.append(S.charAt(i));
            }
        }

        int result = sb.toString().contains(K) ? 1 : 0;
        System.out.println(result);

    }
}
