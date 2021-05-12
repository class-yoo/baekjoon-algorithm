package p2021.p05.p12;

import java.util.Scanner;

public class P1025 {
    static int N;
    static int M;
    static int board [][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] number = sc.next().split("");
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(number[j]);
            }
        }

        int ans = -1;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {
                for (int dx = -N; dx < N; dx++) {
                    for (int dy = -M; dy < M; dy++) {
                        int val = 0;
                        if (dx == 0 && dy == 0)
                            continue;
                        int curX = x;
                        int curY = y;
                        while (!isOutOfBounds(curX, curY)) {
                            val = 10 * val + (board[curX][curY]);
                            if (isSquare(val))
                                ans = Math.max(ans, val);
                            curX += dx;
                            curY += dy;
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isSquare(int x) {
        int t = (int)Math.sqrt(x);
        for (int i = t - 2; i <= t + 2; i++)
            if (i*i == x) return true;
        return false;
    }

    static boolean isOutOfBounds(int x, int y) {
        return x < 0 || x >= N || y < 0 || y >= M;
    }
}
