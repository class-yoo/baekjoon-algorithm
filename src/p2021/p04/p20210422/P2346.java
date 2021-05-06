package p2021.p04.p20210422;

import java.util.*;

public class P2346 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        boolean [] isChecked  = new boolean[n];

        for(int i=0; i<n; i ++) {
            arr[i] = sc.nextInt();
        }

        int curIdx = 0;
        System.out.println(curIdx+1);
        isChecked[curIdx] = true;

        curIdx += arr[curIdx];

        int checkCnt = 0;
        while (checkCnt < arr.length) {
            for (int i = 1; curIdx < n; i++) {
                
            }
        }


        System.out.println(curIdx+1);
    }

}
