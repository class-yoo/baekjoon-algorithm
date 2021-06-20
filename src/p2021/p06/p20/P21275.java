package p2021.p06.p20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21275 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= 36; i++) {
            boolean isPass = true;
            int mulNum = 1;
            int aTotal = 0;
            for (int j = A.length() - 1; j >= 0; j++) {
                if (convertWordToNumber(A.charAt(j)) < i) {
                    isPass = false;
                    break;
                }
            }

            if (isPass == true) {
                for (int k = 2; k <= 36; k++) {
                    if (i != k) {
                    }
                }
            }
        }
    }

    public static int convertWordToNumber(char word) {
        if (word < 'a') {
            return word - '0';
        }

        return 10 + word - 'a';
    }
}
