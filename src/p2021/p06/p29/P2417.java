package p2021.p06.p29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2417 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());

        long left = 1;
        long right = (long) Math.sqrt(n);
        long mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;

            if (Math.pow(mid, 2) > n) {
                right = mid - 1;
            } else if (Math.pow(mid, 2) < n){
                left = mid + 1;
            } else {
                break;
            }
        }

        if (Math.pow(mid,2) < n) mid++;

        System.out.println(mid);
    }
}
