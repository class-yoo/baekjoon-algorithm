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

        dfs(0,0);
        System.out.println(max);
    }


    public static void dfs(int cnt, int idx) {
        if (idx >= n || cnt >= n-1) {
            max = Math.max(max, cnt);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (i == idx) continue;
            if (!isBroken[i]) {
                int originCnt = cnt;
                int temp1 = eggs[i][0];
                eggs[i][0] = eggs[i][0] - eggs[idx][1];

                if (eggs[i][0] <= 0) {
                    isBroken[i] = true;
                    cnt++;
                }

                int temp2 = eggs[idx][0];
                eggs[idx][0] = eggs[idx][0] - eggs[i][1];
                if (eggs[idx][0] <= 0) {
                    isBroken[idx] = true;
                    cnt++;
                }

                int copiedIdx = idx;
                copiedIdx++;

                while (copiedIdx < n && isBroken[copiedIdx]) {
                    copiedIdx++;
                }

                dfs(cnt, copiedIdx);
                eggs[i][0] = temp1;
                eggs[idx][0] = temp2;
                isBroken[idx] = isBroken[i] = false;
                cnt = originCnt;
            }

        }
    }
}
