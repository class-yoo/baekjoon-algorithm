package p2021.p05.p20210503;

import java.util.Scanner;

public class P16439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] preferences = new int [n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                preferences[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
                for (int k = j+1; k < m; k++) {
                    int tempSum = 0;
                    for (int l = 0; l < n; l++) {
                        tempSum += Math.max(preferences[l][i],
                                Math.max(preferences[l][j], preferences[l][k]));
                    }
                    max = Math.max(max, tempSum);
                }
            }
        }

        System.out.println(max);
    }
}
