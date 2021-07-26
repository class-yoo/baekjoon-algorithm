package p2021.p07.p25;

import java.util.Scanner;

public class P15649 {

    static int[] numbers;
    static boolean[] isUsed;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[m];
        isUsed = new boolean[n + 1];


        dfs(0);
    }

    public static void dfs(int stackedIdx) {
        if (stackedIdx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (isUsed[i] == false) {
                numbers[stackedIdx] = i;
                isUsed[i] = true;
                dfs(stackedIdx + 1);
                isUsed[i] = false;
            }
        }
    }
}
