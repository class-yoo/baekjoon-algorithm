package p2021;

import java.util.Scanner;

public class P16508 {

    static int wordIdx;
    static int totalPrice;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int n = sc.nextInt();

        int[] bookPrices = new int[n];
        char[][] bookList = new char[n][26];

        for (int i = 0; i < n; i++) {
            bookPrices[i] = sc.nextInt();
            String bookTitle = sc.next();

            for (int j = 0; j < bookTitle.length(); j++) {
                bookList[i][bookTitle.charAt(j) - 'A']++;
            }
        }

        wordIdx = 0;
        totalPrice = 0;
        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            char[] tempArr = bookList[i].clone();
            totalPrice += bookPrices[i];

            for (int j = 0; j < tempArr.length; j++) {
                if (tempArr[j] > 0) {
                    if ((char)(tempArr[j] + 'A') == word.charAt(wordIdx)) {
                        wordIdx++;
                        tempArr[j]--;
                    }
                }
            }

            if (wordIdx >= word.length() - 1 ) {
                break;
            }
        }

        System.out.println(totalPrice);
    }
}
