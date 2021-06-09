package p2021.p06.p09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P5618 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputArr = new String[n];
        int[] arr = new int[n];
        int min = 100000001;
        List<Integer> list = new ArrayList<>();
        inputArr = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
            min = Math.min(min, arr[i]);
        }

        for (int i = 1; i <= min; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] % i != 0) {
                    break;
                }

                cnt++;
            }

            if (cnt == n) list.add(i);
        }

        StringBuilder sb = new StringBuilder();

        for (int number : list) {
            sb.append(number).append("\n");
        }

        System.out.println(sb.toString());
    }
}
