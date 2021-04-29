package p2021.p20210429;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P5568 {

    static Set<Integer> set;
    static int[] arr;
    static boolean[] isUsed;
    static int n;
    static int k;

    public static void main(String[] args) {
        set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int [n];
        isUsed = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            isUsed[i] = true;
            setNumber(1, i, arr[i]);
            isUsed[i] = false;
        }

        System.out.println(set.size());
    }

    public static void setNumber(int count, int i, int number) {

        if (count == k) {
            set.add(number);
            return;
        }

        for (int j = 0; j < n; j++) {
            if(isUsed[j] == false) {
                isUsed[j] = true;
                int tempNumber = number;
                if (arr[j] < 10) tempNumber *= 10;
                else tempNumber *= 100;
                tempNumber += arr[j];
                setNumber(count+1, j, tempNumber);
                isUsed[j] = false;
            }
        }
    }
}
