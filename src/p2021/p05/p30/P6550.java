package p2021.p05.p30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] arr = br.readLine().split(" ");
            String s = arr[0];
            String t = arr[1];
            int sIdx = 0;
            String result = "No";

            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(sIdx) == t.charAt(i)) {
                    sIdx++;
                    if (sIdx == s.length()) {
                        result = "Yes";
                        break;
                    }
                }
            }

            System.out.println(result);
        }

    }
}
