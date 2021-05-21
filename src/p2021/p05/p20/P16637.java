package p2021.p05.p20;

import java.util.ArrayList;
import java.util.Scanner;

public class P16637 {

    static int N;
    static ArrayList<Integer> numbers;
    static ArrayList<Character> symbols;
    static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String input = sc.next();
        numbers = new ArrayList<>();
        symbols = new ArrayList<>();
        max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++) {
            if(i%2==0) {
                numbers.add(input.charAt(i)-'0');
                continue;
            }

            symbols.add(input.charAt(i));
        }

        dfs(0, numbers.get(0));

        System.out.println(max);
    }

    public static void dfs(int idx, int num) {
        if (idx >= symbols.size()) {
            max = Math.max(max, num);
            return;
        }

        int result1 = getCalNum(num, numbers.get(idx+1), idx);
        dfs(idx+1, result1);

        if (idx+1 < symbols.size()) {
            int result2 = getCalNum(numbers.get(idx+1), numbers.get(idx+2), idx+1);
            int result3 = getCalNum(num, result2, idx);
            dfs(idx+2, result3);
        }
    }


    public static int getCalNum(int num1, int num2, int symbolIdx) {
        int result = 0;

        switch (symbols.get(symbolIdx)) {
            case '+':
                result = num1+num2;
                break;
            case '-' :
                result = num1-num2;
                break;
            case '*' :
                result = num1*num2;
                break;
        }

        return result;
    }
}
