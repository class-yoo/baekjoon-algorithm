package p2021.p08.p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[] cables = new int [k];

        for (int i = 0; i < k; i++) {
            cables[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cables);

        long start = 1;
        long end = cables[k - 1];
        long mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            int cnt = 0;
            int cableIdx = k - 1;

            while(mid <= cables[cableIdx]) {
                cnt += cables[cableIdx--] / mid;
                if (cableIdx < 0) break;
            }

            if (cnt >= n ) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
