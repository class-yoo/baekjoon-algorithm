package p2021.p20210422;

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
        for (int i = 1; i < n; i++) {
            System.out.println(curIdx+1);
            isChecked[curIdx] = true;
            curIdx = getNextIdx(curIdx , arr, isChecked);  // 다음 풍선위치 구하기
        }

        System.out.println(curIdx+1);
    }

    public static int getNextIdx(int curIdx, int arr[], boolean[] isChecked) {

        int moveNumber = arr[curIdx]; // 움직일 거리
        int nextIdx = 0;

        if (moveNumber < 0) {
            for (int i = -1; i >= moveNumber ; i--) {
                if (curIdx + i < 0) {
                    if(isChecked[arr.length + i]) {
                        moveNumber--;
                    }
                } else {
                    if(isChecked[curIdx + i]) {
                        moveNumber--;
                    }
                }
            }

            nextIdx = curIdx + moveNumber < 0 ? arr.length + curIdx + moveNumber : curIdx + moveNumber;

        } else {
            for (int i = 1; i <= moveNumber ; i++) {
                if (curIdx + i > arr.length - 1) {
                    if(isChecked[curIdx + i - arr.length]) {
                        moveNumber++;
                    }
                } else {
                    if(isChecked[curIdx + i]) {
                        moveNumber++;
                    }
                }
            }

            nextIdx = curIdx + moveNumber > arr.length - 1 ? curIdx + moveNumber - arr.length : curIdx + moveNumber;
        }

        return nextIdx;
    }
}
