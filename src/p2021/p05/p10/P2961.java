package p2021.p05.p10;

import java.util.Scanner;

public class P2961 {

    static int n;
    static int[][] ingredients;
    static int ingredientCnt;
    static boolean isUsed[];
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ingredients = new int[n][2];
        isUsed = new boolean[n];
        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            ingredients[i][0] = sc.nextInt();
            ingredients[i][1] = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            ingredientCnt = i;
            dfs(0, 0, 1, 0);
        }

        System.out.println(min);
    }


    public static void dfs(int cnt, int curIdx, int sourness, int saltiness) {
        if (cnt == ingredientCnt) {
            int gap = sourness > saltiness ? sourness - saltiness : saltiness - sourness;
            min = Math.min(min ,gap);
        }


        for (int i = curIdx; i < n; i++) {
            if (isUsed[i] == false) {
                isUsed[i] = true;
                dfs(cnt + 1, i+1 ,
                        sourness * ingredients[i][0], saltiness + ingredients[i][1]);
                isUsed[i] = false;
            }
        }
    }
}