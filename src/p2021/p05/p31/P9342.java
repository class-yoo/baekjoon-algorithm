package p2021.p05.p31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9342 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            if(!validate(input)) {
                sb.append("Good\n");
                continue;
            }

            sb.append("Infected!\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean validate(String input) {

        if(input.matches("^(A|B|C|D|E|F)?A+F+C+$(A|B|C|D|E|F)?")) return true;

        return false;
    }
}
