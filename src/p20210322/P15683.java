package p20210322;

import java.util.ArrayList;
import java.util.Scanner;

public class P15683 {

    static int [][] initOffice;
    static ArrayList<int[]> cctvLocations;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean [][] currentOffice = new boolean [n][m];
        cctvLocations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int inputNumber = sc.nextInt();
                if (inputNumber > 0) {
                    initOffice[i][j] = inputNumber;
                    currentOffice[i][j] = true;

                    if (inputNumber != 6) {
                        cctvLocations.add(new int []{inputNumber, i, j});
                    }
                }
            }
        }


        for (int i = 0; i < cctvLocations.size(); i++) {

        }
    }

    public static void filming (int cctvIndex) {

    }

    public static int lookTop(boolean [][] currentOffice, int i, int j, int count) {

        while (i > 0) {
            if (isWallPoint(i-1,j) == true) break;
            if (currentOffice[i-1][j] == false) {
                currentOffice[i-1][j] = true;
                count++;
            }

            i--;
        }

        return count;
    }

    public static int lookLeft(boolean [][] currentOffice, int i, int j, int count) {

        while (j > 0) {
            if (isWallPoint(i,j-1) == true) break;
            if (currentOffice[i][j-1] == false) {
                currentOffice[i][j-1] = true;
                count++;
            }

            j--;
        }

        return count;
    }

    public static int lookRight(boolean [][] currentOffice, int i, int j, int count) {

        while (j < currentOffice[0].length -1) {
            if (isWallPoint(i,j+1) == true) break;
            if (currentOffice[i][j+1] == false) {
                currentOffice[i][j] = true;
                count++;
            }

            j++;
        }

        return count;
    }

    public static int lookBottom(boolean [][] currentOffice, int i, int j, int count) {

        while (j < currentOffice.length -1) {
            if (isWallPoint(i+1, j) == true) break;
            if (currentOffice[i+1][j] == false) {
                currentOffice[i][j] = true;
                count++;
            }

            i++;
        }

        return count;
    }

    public static boolean isWallPoint(int i, int j) {
        return initOffice[i][j] == 6;
    }

}
