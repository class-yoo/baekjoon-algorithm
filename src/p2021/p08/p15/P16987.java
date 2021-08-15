package p2021.p08.p15;

import java.util.Scanner;

public class P16987 {
    static int[][] eggs;
    static boolean[] isBroken;
    static int n;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        max = 0;
        eggs = new int [n][2];
        isBroken = new boolean[n];


        for (int i = 0; i < n; i++) {
            eggs[i][0] = sc.nextInt();
            eggs[i][1] = sc.nextInt();
        }
    }


    public static void dfs(int cnt, int idx) {
        if (idx == n) {
            max = Math.max(max, cnt);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i == idx) continue;
            if (!isBroken[i]) {
                int next = 0;
                int temp1 = eggs[i][0];
                eggs[i][0] = eggs[idx][1] - eggs[i][0];

                if (eggs[i][0] <= 0) {
                    isBroken[i] = true;
                    cnt++;
                }

                int temp2 = eggs[idx][0];
                eggs[idx][0] = eggs[i][1] - eggs[idx][0];

                if (eggs[idx][0] <= 0) {
                    isBroken[idx] = true;
                    cnt++;
                }
            }

        }
    }
}
