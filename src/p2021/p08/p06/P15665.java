package p2021.p08.p06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P15665 {
    static int[] numbers;
    static int[] initNumbers;
    static int n;
    static int m;
    static StringBuilder sb;
    static StringBuilder sb2;
    static Set<String> set;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();
        sb2 = new StringBuilder();
        n = sc.nextInt();
        m = sc.nextInt();
        initNumbers = new int[n];
        numbers = new int[m];
        set = new HashSet<>();

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
                sb2.append(numbers[i] + " ");
            }

            if (set.contains(sb2.toString())) {
                sb2 = new StringBuilder();
                return;
            }

            set.add(sb2.toString());
            sb.append(sb2.toString()).append("\n");
            sb2 = new StringBuilder();
            return;
        }

        for (int i = 0; i < n; i++) {
            numbers[idx] = initNumbers[i];
            dfs(idx + 1);
        }
    }
}
