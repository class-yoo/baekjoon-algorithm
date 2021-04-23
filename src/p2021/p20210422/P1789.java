package p2021.p20210422;

import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Long s = sc.nextLong();
        Long sum = 1L;
        Long count = 1L;

        while (sum < s) {
            sum += ++count;
        }

        count = sum == s ? count : count-1;

        System.out.println(count);
    }
}