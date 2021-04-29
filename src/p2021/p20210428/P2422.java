package p2021.p20210428;

import java.util.Scanner;

public class P2422 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] isNotAvailable = new boolean [n+1][n+1];

        for (int i = 0; i < m ; i++) {
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            isNotAvailable[number1][number2] = true;
            isNotAvailable[number2][number1] = true;
        }

        int totalCount = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = i+1; j <=n ; j++) {
                if (isNotAvailable[i][j] == false) {
                    for (int k = j+1; k <=n ; k++) {
                        if (isNotAvailable[j][k] == false && isNotAvailable[i][k] == false){
                            totalCount++;
                        }
                    }
                }
            }
        }

        System.out.println(totalCount);
    }
}