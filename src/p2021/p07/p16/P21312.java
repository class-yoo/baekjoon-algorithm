package p2021.p07.p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21312 {

    static int deliciousCocktail;
    static String[] cocktailNumbers;
    static int maxCount = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cocktailNumbers = br.readLine().split(" ");
        deliciousCocktail = 0;

        for (int i = 1; i <= cocktailNumbers.length; i++) {
            maxCount = i;
            for (int j = 0; j < cocktailNumbers.length; j++) {
                makeCocktail(1, Integer.valueOf(cocktailNumbers[j]), j);
            }
        }

        System.out.println(deliciousCocktail);
    }

    public static void makeCocktail(int curCnt, int mulNum, int curIdx) {
        if (maxCount == curCnt) {
            deliciousCocktail =
                    getDeliciousCocktailNum(deliciousCocktail, mulNum);
            return;
        }

        for (int i = curIdx + 1; i < cocktailNumbers.length; i++) {
            makeCocktail(
                    curCnt+1,
                    Integer.parseInt(cocktailNumbers[i]) * mulNum,
                    i
            );
        }

    }

    public static int getDeliciousCocktailNum(int num1, int num2) {
        if (num1 % 2 == 1) {
            if (num2 % 2 == 1) {
                return Math.max(num1, num2);
            }
            return num1;
        }

        if (num2 % 2 == 1) {
            return num2;
        }

        return Math.max(num1, num2);
    }
}
