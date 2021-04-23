package p2021.p20210422;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        for (i = 1; i < n ; i++) {
            int tempN = i;
            int sum = 0;
            while (tempN != 0) {
                sum += tempN % 10;
                tempN /= 10;
            }
            if (i + sum == n) break;
        }

        System.out.println(i == n ? 0 : i);
    }
}
