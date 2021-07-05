package p2021.p07.p05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14500 {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] isVisited;
    static int[] di = {-1, 0, 1, 0}; // 상, 좌, 하, 우
    static int[] dj = {0, -1, 0, 1}; // 상, 좌, 하, 우
    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N][M];
        isVisited = new boolean[N][M];
        max = 0;

        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                searchMaxByPoint(i, j);
            }
        }

        System.out.println(max);
    }

    public static void searchMaxByPoint(int i, int j) {
        dfs(i, j, 0, 0);
        exceptionDFS(i, j);
    }

    public static void dfs (int i, int j, int sum, int depth) {
        if (depth >= 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int k = 0; k < 4 ; k++) {
            int nextI = i + di[k];
            int nextJ = j + dj[k];

            if (nextI < 0 || nextJ < 0 || nextI >= N || nextJ >= M)
                continue;

            if (isVisited[nextI][nextJ] == false) {
                isVisited[nextI][nextJ] = true;
                dfs(nextI, nextJ, sum + arr[nextI][nextJ], depth + 1);
                isVisited[nextI][nextJ] = false;
            }
        }
    }

    static void exceptionDFS(int i, int j) {

        int center = arr[i][j];

        if (i-1 >= 0 && j-1 >= 0 && j+1 < M) // ㅗ
            max = Math.max(max, center + arr[i-1][j] + arr[i][j-1] + arr[i][j+1]);
        if (i-1 >= 0 && j-1 >= 0 && i+1 < N) // ㅓ
            max = Math.max(max, center + arr[i-1][j] + arr[i][j-1] + arr[i+1][j]);
        if (j-1 >= 0 && i+1 < N && j+1 < M) // ㅜ
            max = Math.max(max, center + arr[i][j-1] + arr[i+1][j] + arr[i][j+1]);
        if ( i+1 < N && j+1 < M && i-1 >= 0) // ㅏ
            max = Math.max(max, center + arr[i+1][j] + arr[i][j+1] + arr[i-1][j]);
    }
}