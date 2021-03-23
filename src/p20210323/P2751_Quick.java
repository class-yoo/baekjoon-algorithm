package p20210323;

import java.util.Scanner;

/**
 * 최악의 경우의 경우도 O(nlogn)을 보장해야 하므로 퀵 정렬은 해답x
 */
public class P2751_Quick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr);

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }


    public static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end); // 나눈 파티션의 오른쪽 첫번째 idx

        /**
         * (오른쪽 파티션이 시작점 바로 다음에서 시작 = 왼쪽데이터가 1개인 경우) 정렬 필요 x
         * EX) 3 | 8 5 4 6 -> 이런 경우면 정렬시도 x
         * EX) 4 3 | 8 5 6 이 경우라면 4(시작 idx = 0) < 8(오른쪽 파티션 시작 idx = 2) -1
         * 0 < 2-1 이면 왼쪽에 데이터는 2개 이상인것이 확실하기 때문에 왼쪽 정렬 시도
         */
        if (start < part-1) {
            quickSort(arr, start, part - 1);
        }

        /**
         *  오른쪽 파티션의 개수가 2개 이상인 경우만 정렬시도
         *  EX) 3 6 5 4 | 8 인 경우 (8 = 오른쪽 파티션 시작 idx 4 = 끝 idx 4)
         *  EX) 3 5 4 | 8 6 인 경우 (8 = 오른쪽 파티션 시작 idx 3 = 끝 idx 4)
         *  3 < 4이면 오른쪽 파티션의 데이터는 2개이상인 것이 확실하기 때문에 오른쪽 정렬시도
         */
        if (part < end) {
            quickSort(arr, part, end);
        }

    }


    public static int partition(int[] arr, int start, int end) {

        /**
         * 4 3 [8] 5 6 -> 8 피봇 선정
         */
        int  pivot = arr[(start + end) / 2]; // 피봇은 파티션의 중간 idx의 value로 선정

        /**
         * 시작지점이 끝지점보다 커지면 반복문 탈출
         * 서로 모두 피봇 값을 기준으로 모두 교환하고 start > end 가 될때까지 계속 돌기
         */
        while (start <= end) {

            /**
             * 맨앞->오른쪽 으로 가면서 선정된 피봇보다 크거나 같은 값을 찾음
             * 4 3 [8] 5 6 -> 여기서는 맨 앞부터 4, 3 이 모두 8보다 크지 않기 때문에 8의 idx = 2에서 멈춤
             * 4 3 8 5 6 [처음 배열]
             * 4 3 6 5 8 [처음 파티션 나누기 로직 수행]
             */
            while (arr[start] < pivot) start++;

            /**
             * 맨뒤->왼쪽 으로 가면서 선정된 피봇보다 작거나 같은 값을 찾음
             * 4 3 [8] 5 6 -> 여기서는 맨 뒤부터 6이 8보다 작기때문에 바로 6의 idx = 4에서 멈춤
             */
            while (pivot < arr[end]) end--;

            /**
             * 혹시 가면서 서로 지나쳤는지 체크하고 지나치지 않았으면 start, end 교환
             * 위의 경우 start = 2, end = 4에서 멈췄기 때문에  서로 지나치지 않았기 때문에 교환
             * 교환 후에 다음 idx 부터 체크해야 하기 때문에 한칸씩 옮겨준다.
             */
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        // 오른쪽 파티션의 시작 idx 반환
        return start;
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
