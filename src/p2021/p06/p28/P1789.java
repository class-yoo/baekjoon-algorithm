package p2021.p06.p28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());

        long left = 1L;
        long right = S;
        long mid = 0L;

        while(left <= right) {
            mid = (left + right) / 2;

            if (getTotalSum(mid) <= S && getTotalSum(mid+1) >= S)
                break;
            if (getTotalSum(mid) > S) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(mid);
    }

    public static long getTotalSum(long n) {
        long result = (1 + n) * n/2;

        if (n % 2 == 1) {
            result += (1+n) / 2;
        }

        return result;
    }
}
