package p2021.p05.p18;

import java.util.ArrayList;
import java.util.Scanner;

public class P15686 {
    static int N;
    static int M;
    static int[] remainChickens;
    static ArrayList<int[]> houses;
    static ArrayList<int[]> chickens;
    static boolean[] isVisited;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        houses = new ArrayList<>();
        chickens = new ArrayList<>();
        remainChickens = new int [M];
        min = Integer.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int temp = sc.nextInt();

                if (temp == 1) {
                    houses.add(new int[] {i, j});
                } else if (temp == 2) {
                    chickens.add(new int[] {i, j});
                }
            }
        }

        isVisited = new boolean[chickens.size()];

        findMinChickenDistance(0, 0);

        System.out.println(min);
    }

    public static void findMinChickenDistance(int chickenIdx, int remainChickenIdx) {
        if (remainChickenIdx >= M) {
            setMinChickenDistance();
            return;
        }

        for (int i = chickenIdx; i < chickens.size(); i++) {
            if (isVisited[i] == false) {
                isVisited[i] = true;
                remainChickens[remainChickenIdx] = i;
                findMinChickenDistance(i+1, remainChickenIdx+1);
                isVisited[i] = false;
            }
        }
    }

    private static void setMinChickenDistance() {
        int sumDistance = 0;

        for (int i = 0; i < houses.size(); i++) {
            int tempMinDistance = Integer.MAX_VALUE;
            int [] housePoint = houses.get(i);
            for (int j = 0; j < M; j++) {
                int [] chickenPoint = chickens.get(remainChickens[j]);
                tempMinDistance =
                        Math.min(tempMinDistance,
                                Math.abs(housePoint[0] - chickenPoint[0]) + Math.abs(housePoint[1] - chickenPoint[1])
                        );
            }
            sumDistance += tempMinDistance;

            if (sumDistance > min) return;
        }

        min = Math.min(min, sumDistance);
    }
}
