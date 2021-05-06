package p2021.p04.p20210424;

import java.util.Scanner;

public class P15650 {

    static int n;
    static int m;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int printCnt = 0;
        boolean[] isUsed = new boolean[n+1];

        for (int i = 1; i <= n ; i++) {
            String printNumber = i + " ";
            printCnt++;
            isUsed[i] = true;
            printNumber(i, isUsed, printCnt, printNumber);
            printCnt--;
            isUsed[i] = false;
        }
    }

    public static void printNumber (int number, boolean[] isUsed, int printCnt, String printNumber) {
        if (printCnt >= m) {
            System.out.println(printNumber);
            return;
        }

        for (int i = number + 1; i <= n ; i++) {
            if (!isUsed[i]) {
                String temp = printNumber + i + " ";
                printCnt++;
                isUsed[i] = true;
                printNumber(i, isUsed, printCnt, temp);
                printCnt--;
                isUsed[i] = false;
            }
        }
    }
}

