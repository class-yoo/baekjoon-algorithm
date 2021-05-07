package p2021.p05.p06;

import java.util.Scanner;

public class P14620 {

    static int n;
    static int[][] map;
    static int[][] costMap;
    static boolean[][] isCovered;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new int [n][n];
        costMap = new int [n][n];
        isCovered = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                costMap[i][j] = map[i][j] + map[i-1][j] + map[i][j-1] + map[i+1][j] + map[i][j+1];
            }
        }

        int min = Integer.MAX_VALUE;


        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                cover(i, j);
                for (int i2 = 1; i2 < n-1 ; i2++) {
                    for (int j2 = 1; j2 < n-1; j2++) {
                        if (isCovered[i2][j2] == false) {
                            cover(i2, j2);
                            for (int i3 = 1; i3 < n - 1; i3++) {
                                for (int j3 = 1; j3 < n - 1; j3++) {
                                    if (isCovered[i3][j3] == false) {
                                        min = Math.min(min, costMap[i][j] + costMap[i2][j2] + costMap[i3][j3]);
                                    }
                                }
                            }
                            discover(i2, j2);
                            cover(i,j);
                        }
                    }
                }
                discover(i, j);
            }
        }

        System.out.println(min);
    }


    public static void cover(int i, int j) {
        isCovered[i][j] = true;
        isCovered[i-1][j] = true;
        if (i-2 >= 0) isCovered[i-2][j] = true;
        isCovered[i-1][j-1] = true;
        isCovered[i][j-1] = true;
        if (j-2 >= 0) isCovered[i][j-2] = true;
        isCovered[i+1][j-1] = true;
        isCovered[i+1][j] = true;
        if (i+2 <= n-1) isCovered[i+2][j] = true;
        isCovered[i+1][j+1] = true;
        isCovered[i][j+1] = true;
        if (j+2 <= n-1) isCovered[i][j+2] = true;
        isCovered[i-1][j+1] = true;
    }

    public static void discover(int i, int j) {
        isCovered[i][j] = false;
        isCovered[i-1][j] = false;
        if (i-2 >= 0)  isCovered[i-2][j] = false;
        isCovered[i-1][j-1] = false;
        isCovered[i][j-1] = false;
        if (j-2 >= 0)  isCovered[i][j-2] = false;
        isCovered[i+1][j-1] = false;
        isCovered[i+1][j] = false;
        if (i+2 <= n-1) isCovered[i+2][j] = false;
        isCovered[i+1][j+1] = false;
        isCovered[i][j+1] = false;
        if (j+2 <= n-1) isCovered[i][j+2] = false;
        isCovered[i-1][j+1] = false;
    }
}
