package p2021.p06.p30;

import java.util.Arrays;
import java.util.Scanner;

public class P10815 {

    static int[] cards;

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if (contains(num)) {
                sb.append(1).append(" ");
                continue;
            }
            sb.append(0).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static boolean contains(int num) {
        int start = 0;
        int end = cards.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;

            if (cards[mid] < num) {
                start = mid + 1;
            } else if (cards[mid] > num ){
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
