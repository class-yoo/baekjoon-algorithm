package p2021.p07.p04;

import java.util.Scanner;

public class P2512 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] budget = new int [n];
        int max = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            budget[i] = sc.nextInt();
            max = Math.max(max, budget[i]);
            total += budget[i];
        }

        int m = sc.nextInt();

        if (total <= m) {
            System.out.println(max);
            return;
        }

        int start = 3;
        int end = max;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += mid < budget[i] ? mid : budget[i];
            }

            if (sum <= m) {
                start =  mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
