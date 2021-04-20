package p2021.p20210420;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        int idx = 1;
        int number = 1;
        int answer = 0;
        while (queue.size() != 1) {
            if (idx % 2 == 0)
            queue.poll();
            if (queue.size() == 1) break;
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
