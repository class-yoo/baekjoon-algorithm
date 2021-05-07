package p2021.p04.p30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * 중복된 수를 허용하기 때문에 boolean isUsed[] 등으로 사용한 숫자 체크할 필요가 없음.
 */

public class P18511 {

    static int n;
    static int k;
    static Integer[] arr;
    static int max;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new Integer[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        setNumber(0);
        System.out.println(max);
    }

    public static void setNumber(int number) {
        if(n < number) return;
        max = Math.max(max, number);

        for (int i = 0; i < k; i++) {
            setNumber(number * 10 + arr[i]);
        }
    }

}
