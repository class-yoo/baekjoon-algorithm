package p2021.p05.p11;

import java.util.Scanner;

public class P15661 {
    public static int n;
    public static int[][] arr;
    public static boolean[] visit;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        arr = new int[n][n];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        dfs(0,0);
        System.out.println(min);
    }
    public static void dfs(int idx, int count) {
        // 팀 조합 완성
        if (count == n / 2) {
            diff();
            return;
        }

        for (int i = idx; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    public static void diff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visit[i] && visit[j]) {
                    start += arr[i][j];
                    start += arr[j][i];
                } else if (!visit[i] && !visit[j]) {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }
        }

        int val = Math.abs(start - link);

        if (val == 0) {
            System.out.println(val);
        }
        min = Math.min(val, min);
    }
}
