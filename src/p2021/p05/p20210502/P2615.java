package p2021.p05.p20210502;

import java.util.Scanner;

public class P2615 {
    static final int  MAX_VALUE = 19;
    static final int  MAX_COUNT = 5;
    static int[][] space;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        space = new int [MAX_VALUE + 1][MAX_VALUE + 1];

        for (int i = 1; i <= MAX_VALUE ; i++) {
            for (int j = 1; j <= MAX_VALUE ; j++) {
                space[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= MAX_VALUE ; i++) {
            for (int j = 1; j <= MAX_VALUE ; j++) {
                if (space[i][j] != 0) {
                    int color = space[i][j];
                    int tempI = i;
                    int tempJ = j;
                    int count = 0;

                    while (!isOverThanMax(tempI)) {
                        if (!isSameColor(color, space[tempI][tempJ])) break;

                        count++;

                        if (!isSameColor(color, space[i-1][j]) && isMaxCount(count)) {
                            if (isEndGame(tempI+1, tempJ, color)) {
                                printResult(color, i, j);
                                return;
                            } else {
                                break;
                            }
                        }
                        tempI++;
                    }

                    tempI = i;
                    count = 0;

                    while (!isOverThanMax(tempJ)) {
                        if (!isSameColor(color, space[tempI][tempJ])) break;

                        count++;

                        if (!isSameColor(color, space[i][j-1]) && isMaxCount(count)) {
                            if (isEndGame(tempI, tempJ+1, color)) {
                                printResult(color, i, j);
                                return;
                            } else {
                                break;
                            }
                        }
                        tempJ++;
                    }

                    tempJ = j;
                    count = 0;

                    while (!isOverThanMax(tempI) && !isOverThanMax(tempJ)) {
                        if (!isSameColor(color, space[tempI][tempJ])) break;

                        count++;

                        if (!isSameColor(color, space[i-1][j-1]) && isMaxCount(count)) {
                            if (isEndGame(tempI+1, tempJ+1, color)) {
                                printResult(color, i, j);
                                return;
                            } else {
                                break;
                            }
                        }

                        tempI++;
                        tempJ++;
                    }

                    tempI = i;
                    tempJ = j;
                    count = 0;

                    while (!isLessThanMin(tempI) && !isOverThanMax(tempJ)) {
                        if (!isSameColor(color, space[tempI][tempJ])) break;

                        count++;
                        boolean isSameBeforePointColor = false;

                        if (!isOverThanMax(i+1)) {
                            if (isSameColor(color, space[i+1][j-1])) {
                                isSameBeforePointColor = true;
                            }
                        }

                        if (isSameBeforePointColor == false && isMaxCount(count)) {
                            if(isLessThanMin(tempI-1) || isOverThanMax(tempJ+1)) {
                                System.out.println(color);
                                System.out.println(i + " "+ j);
                                return;
                            }

                            if (!isSameColor(color, space[tempI-1][tempJ+1])) {
                                System.out.println(color);
                                System.out.println(i + " "+ j);
                                return;
                            }

                            break;
                        }

                        tempI--;
                        tempJ++;
                    }

                }
            }
        }

        System.out.println(0);

    }

    private static void printResult(int color, int i, int j) {
        System.out.println(color);
        System.out.print(i + " " + j);
    }

    public static boolean isLessThanMin(int num) {
        return num < 1;
    }

    public static boolean isOverThanMax(int num) {
        return num > MAX_VALUE;
    }

    public static boolean isSameColor(int color, int point) {
        return color == point;
    }

    public static boolean isMaxCount(int count) {
        return count == MAX_COUNT;
    }

    public static boolean isEndGame(int targetI, int targetJ, int color) {

        if(isOverThanMax(targetI) || isOverThanMax(targetJ))
            return true;

        int point = space[targetI][targetJ];

        if (isSameColor(color, point))
            return false;
        else
            return true;
    }
}
