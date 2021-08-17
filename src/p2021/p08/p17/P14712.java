package p2021.p08.p17;

import java.util.Scanner;

public class P14712 {
    static boolean[][] map;
    static int n;
    static int m;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new boolean[n][m];

        dfs(0,0);

        System.out.println(cnt);
    }


    public static void dfs(int i, int j) {
        if (isOut(i, j)) return;

        if (!isNot4Block(i, j)) {
            return;
        }
    }

    private static boolean isNot4Block(int i, int j) {
        if (map[i][j] || map[i-1][j] || map[i][j-1] || map[i-1][j-1])
            return false;
        if (map[i][j] || map[i][j+1] || map[i-1][j] || map[i-1][j+1])
            return false;
        if (map[i][j] || map[i][j-1] || map[i+1][j] || map[i+1][j-1])
            return false;
        if (map[i][j] || map[i+1][j] || map[i][j+1] || map[i+1][j+1])
            return false;

        return true;
    }

    private static boolean isOut(int i, int j) {
        if (i < 0 || n<= i) return true;
        if (j < 0 || m<= j) return true;

        return false;
    }
}
