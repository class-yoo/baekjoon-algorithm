package p2021.p07.p30;

import java.util.Scanner;

public class P15652 {
    static int[] numbers;
    static int n;
    static int m;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[m];

        dfs(0, 1);
        System.out.println(sb.toString());
    }

    public static void dfs(int idx, int preNum) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(numbers[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = preNum; i <= n; i++) {
            numbers[idx] = i;
            dfs(idx + 1, i);
        }
    }
}
