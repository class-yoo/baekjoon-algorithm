package p2021.p06.p24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int[] countArr = new int[26];
            char[] arr = input.toCharArray();
            boolean isGroupWord = true;
            char preWord = arr[0];
            countArr[preWord - 'a']++;

            for (int j = 1; j < arr.length; j++) {
                if (preWord != arr[j]) {
                    if (countArr[arr[j] - 'a'] !=0 ) {
                        isGroupWord = false;
                        break;
                    }
                    preWord = arr[j];
                    countArr[preWord - 'a']++;
                }
            }

            if (isGroupWord == true) count++;

        }

        System.out.println(count);
        br.close();
    }
}
