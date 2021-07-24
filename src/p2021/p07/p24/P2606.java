package p2021.p07.p24;

import java.util.Scanner;

public class P2606 {
    static boolean[][] network;
    static boolean[] isInfected;
    static int infectCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt();
        int connectCnt = sc.nextInt();

        network = new boolean[com + 1][com + 1];
        isInfected = new boolean[com + 1];
        infectCnt = 0;

        for (int i = 0; i < connectCnt; i++) {
            int dep = sc.nextInt();
            int dest = sc.nextInt();

            network[dep][dest] = network[dest][dep] = true;
        }

        dfs(1);

        System.out.println(infectCnt);
    }


    public static void dfs(int dep) {
        isInfected[dep] = true;

        for (int i = 1; i < network.length; i++) {
            if (network[dep][i] == true) {
                if (isInfected[i] == false) {
                    infectCnt++;
                    dfs(i);
                }
            }
        }

    }
}
