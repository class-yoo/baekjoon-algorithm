package p2021.p08.p02;

import java.util.Arrays;
import java.util.Scanner;

public class P15656 {
    static int[] numbers;
    static int[] initNumbers;
    static int n;
    static int m;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        initNumbers = new int[n];
        numbers = new int[m];

        for (int i = 0; i < n; i++) {
            initNumbers[i] = sc.nextInt();
        }

        Arrays.sort(initNumbers);
        dfs(0);
        System.out.println(sb.toString());
    }

    public static void dfs(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(numbers[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            numbers[idx] = initNumbers[i];
            dfs(idx + 1);
        }
    }
}
