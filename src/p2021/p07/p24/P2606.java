package p2021.p07.p24;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int connectCnt = sc.nextInt();
        Deque<Integer> infectedQueue = new ArrayDeque<>();

        boolean [][] network = new boolean[com + 1][com + 1];
        boolean[] isInfected = new boolean[com + 1];
        int infectCnt = 0;

        for (int i = 0; i < connectCnt; i++) {
            int dep = sc.nextInt();
            int dest = sc.nextInt();

            network[dep][dest] = true;

            if (dep == 1) {
                infectedQueue.add(dest);
                isInfected[dest] = true;
                infectCnt++;
            }
        }

        while (!infectedQueue.isEmpty()) {
            int dep = infectedQueue.poll();
            for (int i = 2; i <= com; i++) {
                if (network[dep][i]) {
                    if (!isInfected[i]) {
                        isInfected[i] = true;
                        infectedQueue.add(i);
                        infectCnt++;
                    }
                }
            }
        }

        System.out.println(infectCnt);
    }
}
