package p2021.p08.p08;

import java.util.Scanner;

public class P1182 {

    static boolean[] isUsed;
    static int [] numbers;
    static int cnt;
    static int n;
    static int s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();
        isUsed = new boolean[n];
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            dfs(i, 0, 0, 0);
        }

        System.out.println(cnt);
    }

    public static void dfs(int limitCnt, int calNum, int calCnt, int preIdx) {
        if (limitCnt == calCnt) {
            if (calNum == s) cnt++;
            return;
        }

        for (int i = preIdx; i < n; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                dfs(limitCnt, calNum + numbers[i], calCnt + 1, i + 1);
                isUsed[i] = false;
            }
        }
    }
}
