package p2021.p07.p01;

import java.util.Arrays;
import java.util.Scanner;

public class P2805 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr[n-1];
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            int idx = arr.length - 1;
            long sum = 0;
            while(arr[idx] > mid) {
                sum += arr[idx--] - mid ;
                if (idx < 0) break;
            }

            if (sum >= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
