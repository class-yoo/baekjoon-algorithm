package p2021.p06.p01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                sb.append(sb2.reverse().toString());
                sb2 = new StringBuilder();
                while (input.charAt(i) != '>') {
                    sb.append(input.charAt(i++));
                }
                sb.append(input.charAt(i));
                continue;
            }

            if (input.charAt(i) == ' ') {
                sb.append(sb2.reverse().toString()).append(' ');
                sb2 = new StringBuilder();
                continue;
            }

            sb2.append(input.charAt(i));

        }

        sb.append(sb2.reverse().toString());

        System.out.println(sb.toString());
    }
}
