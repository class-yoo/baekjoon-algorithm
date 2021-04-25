package p2021.p20210425;

import java.util.Scanner;

public class P18312 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int endTime = 3600 * n + 60 * 59 + 59;

        for (int i = 0; i <= endTime; i++) {
            int tempEndTime = i;
            int h = tempEndTime / 3600;

            if (h < 10 && k == 0) {
                count++;
                continue;
            }

            if (h%10 == k || h/10 == k) {
                count ++;
                continue;
            }

            tempEndTime = tempEndTime % 3600;

            int m = tempEndTime / 60;

            if (m < 10 && k == 0) {
                count++;
                continue;
            }

            if (m%10 == k || m/10 == k) {
                count ++;
                continue;
            }

            tempEndTime = tempEndTime % 60;

            int s = tempEndTime;

            if (s < 10 && k == 0) {
                count++;
                continue;
            }

            if (s%10 == k || s/10 == k) {
                count ++;
                continue;
            }
        }

        System.out.println(count);
    }
}
