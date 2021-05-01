package p2021.p20210501;

import java.util.Scanner;

public class P16937 {

    static int[] r;
    static int[] c;
    static int h;
    static int w;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        h = sc.nextInt();
        w = sc.nextInt();

        int n = sc.nextInt();

        r = new int[n];
        c = new int[n];

        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isAvailableSticker(i, j)) {
                    max = Math.max(max, r[i] * c[i] + r[j] * c[j]);
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isAvailableSticker(int i, int j) {
        if(isValidWidthAndHeight(r[i], c[i], h, w)) {

            if (isValidWidthAndHeight(r[j], c[j], h - r[i], w)
                    || isValidWidthAndHeight(r[j], c[j], h, w - c[i])) {
                return true;
            }

            if (isValidWidthAndHeight(c[j], r[j], h - r[i] , w)
                    || isValidWidthAndHeight(c[j], r[j], h, w - c[i])) {
                return true;
            }
        }

        if(isValidWidthAndHeight(c[i], r[i], h, w)) {
            if (isValidWidthAndHeight(r[j], c[j], h - c[i], w)
                    || isValidWidthAndHeight(r[j], c[j], h, w - r[i])) {
                return true;
            }

            if (isValidWidthAndHeight(c[j], r[j], h - c[i], w)
                    || isValidWidthAndHeight(c[j], r[j], h, w - r[i])) {
                return true;
            }
        }

        return false;
    }

    public static boolean isValidWidthAndHeight(int r, int c, int h, int w) {
        if(r <= h  && c <= w) {
            return true;
        }

        return false;
    }
}
