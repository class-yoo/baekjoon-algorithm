package p2021.p07.p26;

import java.util.Scanner;

public class P15650 {
    static int[] numbers;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[m];

        dfs(0, 1);
    }


    public static void dfs(int idx, int number) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            return;
        }

        for (int i = number; i <= n; i++) {
            numbers[idx] = i;
            dfs(idx + 1, i + 1);
        }
    }
}
