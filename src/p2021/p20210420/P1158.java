package p2021.p20210420;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int [n];

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int removeCheck = 1;
        int idx = 0;

        while (!queue.isEmpty()) {
            int number = queue.poll();
            if (removeCheck++ % k == 0) {
                result[idx++] = number;
                continue;
            }
            queue.add(number);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<"+result[0]);
        for (int i = 1; i < n; i++) {
            sb.append(", ");
            sb.append(result[i]);
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}
