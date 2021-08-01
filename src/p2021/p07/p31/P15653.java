package p2021.p07.p31;

import java.util.Arrays;
import java.util.Scanner;

public class P15653 {
    static int[] numbers;
    static int[] initNumbers;
    static int n;
    static int m;
    static boolean[] isUsed;


    static StringBuilder sb;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        initNumbers = new int[n];
        isUsed = new boolean[n];
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
            if (isUsed[i] == false) {
                isUsed[i] = true;
                numbers[idx] = initNumbers[i];
                dfs(idx + 1);
                isUsed[i] = false;
            }
        }
    }
}
