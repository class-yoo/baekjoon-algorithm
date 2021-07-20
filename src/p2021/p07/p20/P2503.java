package p2021.p07.p20;

import java.util.ArrayList;
import java.util.Scanner;

public class P2503 {
    static ArrayList<int[]> numbersList;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        numbersList = new ArrayList<>();
        boolean[] isUsed = new boolean[10];

        for (int i = 1; i <= 9 ; i++) {
            int[] numbers = new int[3];
            isUsed[i] = true;
            numbers[0] = i;
            setNumberList(1, numbers, isUsed);
            isUsed[i] = false;
        }

        for (int i = 0; i < n; i++) {
            int throwNumbers = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();

            int[] tempNumbers = new int[3];
            tempNumbers[0] = throwNumbers/100;
            tempNumbers[1] = (throwNumbers%100)/10;
            tempNumbers[2] = throwNumbers%10;

            for (int j = 0; j < numbersList.size() ; j++) {
                int tempStrike = 0;
                int tempBall = 0;
                int[] numbers = numbersList.get(j);

                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (numbers[k] == tempNumbers[l]) {
                            if (k==l) tempStrike++;
                            else tempBall++;
                        }
                    }
                }

                if (strike != tempStrike || ball != tempBall) {
                    numbersList.remove(j--);
                }
            }
        }

        System.out.println(numbersList.size());
    }

    public static void setNumberList(int idx, int[] numbers, boolean[] isUsed) {

        if (idx >= 3) {
            numbersList.add(numbers);
            return;
        }

        for (int i = 1; i <= 9 ; i++) {
            if (!isUsed[i]) {
                int[] cloneNumbers =  numbers.clone();
                cloneNumbers[idx] = i;
                isUsed[i] = true;
                setNumberList(idx + 1, cloneNumbers, isUsed);
                isUsed[i] = false;
            }
        }
    }
}