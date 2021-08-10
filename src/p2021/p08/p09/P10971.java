package p2021.p08.p09;

import java.util.Scanner;

public class P10971 {
    static boolean[] isVisited;
    static int [][] map;
    static int n;
    static int dest;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        isVisited = new boolean[n];
        map = new int[n][n];
        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            dest = i;
            dfs(0, i, 0);
        }

        System.out.println(min);
    }


    public static void dfs(int visitCnt, int curCountry, int price) {
        if(price >= min) return;
        if (visitCnt == n && curCountry == dest) {
            min = Math.min(min, price);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                if (map[curCountry][i] > 0) {
                    isVisited[i] = true;
                    dfs(visitCnt + 1, i, price + map[curCountry][i]);
                    isVisited[i] = false;
                }
            }
        }
    }
}
