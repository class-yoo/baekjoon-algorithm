package p2021.p05.p20;

import java.util.ArrayList;
import java.util.Scanner;

public class P16637 {

    static int N;
    static ArrayList<Integer> numbers;
    static ArrayList<String> symbols;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String [] inputArr = sc.next().split("");
        numbers = new ArrayList<>();
        symbols = new ArrayList<>();
        max = 0;

        for (int i = 0; i < inputArr.length; i++) {
            if(i%2 == 0) {
                numbers.add(Integer.parseInt(inputArr[i]));
                continue;
            }

            symbols.add(inputArr[i]);
        }

        dfs(0, numbers.get(0));

        System.out.println(max);
    }


    public static void dfs(int idx, int num) {
        if (idx >= symbols.size()) {
            max = Math.max(max, num);
            return;
        }

        int firstResult = getCalNum(num, numbers.get(idx+1), idx);
        dfs(idx+1, firstResult);

        if (idx+1 < symbols.size())
        {
            int secondResult = getCalNum(numbers.get(idx+1), numbers.get(idx+2), idx+1); // 뒷순서부터 괄호
            int result = getCalNum(num, secondResult, idx);
            dfs(idx+2, result);
        }
    }


    public static int getCalNum(int num1, int num2, int symbolIdx) {
        int result = 0;

        switch (symbols.get(symbolIdx)) {
            case "+":
                result = num1+num2;
                break;
            case "-" :
                result = num1-num2;
                break;
            case "*" :
                result = num1*num2;
                break;
        }

        return result;
    }
}
