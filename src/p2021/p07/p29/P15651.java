package p2021.p07.p29;

import java.util.Scanner;

public class P15651 {
    static int[] numbers;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[m];

        dfs(0);
    }


    public static void dfs(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            return;
        }

        for (int i = 1; i <= n; i++) {
            numbers[idx] = i;
            dfs(idx + 1);
        }
    }
}
