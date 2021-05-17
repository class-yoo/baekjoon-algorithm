package p2021.p05.p17;

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
        if (depth == 4) {
            max = Math.max(max, sum);
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

        if (i+di[0] >= 0 && j+dj[1] >= 0 && j+dj[3] < M) // ㅗ
            max = Math.max(max, arr[i][j] + arr[i+di[0]][j] + arr[i][j+dj[1]] + arr[i][j+dj[3]]);
        if (i+di[0] >= 0 && j+dj[1] >= 0 && i+di[2] < N) // ㅓ
            max = Math.max(max, arr[i][j] + arr[i+di[0]][j] + arr[i][j+dj[1]] + arr[i+di[2]][j]);
        if (j+dj[1] >= 0 && i+di[2] < N && j+dj[3] < M) // ㅜ
            max = Math.max(max, arr[i][j] + arr[i][j+dj[1]] + arr[i+di[2]][j] + arr[i][j+dj[3]]);
        if ( i+di[2] < N && j+dj[3] < M && i+di[0] >= 0) // ㅏ
            max = Math.max(max, arr[i][j] + arr[i+di[2]][j] + arr[i][j+dj[3]] + arr[i+di[0]][j]);
    }
}