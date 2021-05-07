package p2021.p05.p04;

import java.util.Scanner;

public class P16508 {

    static String word;
    static int n;
    static int wordIdx;
    static int min;
    static int[] bookPrices;
    static int[][] bookWordCountList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        word = sc.next();
        n = sc.nextInt();

        bookWordCountList = new int[n][26];
        bookPrices = new int[n];

        for (int i = 0; i < n; i++) {
            bookPrices[i] = sc.nextInt();
            String bookTitle = sc.next();

            for (int j = 0; j < bookTitle.length(); j++) {
                bookWordCountList[i][bookTitle.charAt(j) - 'A']++;
            }
        }

        min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int[][] clonedBookWordCountList = new int [n][26];

            for(int k = 0; k < n; k++){
                System.arraycopy(bookWordCountList[k], 0, clonedBookWordCountList[k], 0, 26);
            }

            int totalPrice = bookPrices[i];
            boolean[] isUsed = new boolean[n];

            wordIdx = 0;
            isUsed[i] = true;

            for (int j = 0; j < 26; j++) {
                if (clonedBookWordCountList[i][j] > 0) {
                    if ((char)('A' + j) == word.charAt(wordIdx)) {
                        System.out.print((char)('A' + j) + "   ===   ");
                        System.out.println(word.charAt(wordIdx));
                        wordIdx++;
                        clonedBookWordCountList[i][j]--;
                    }
                }

                if (wordIdx > word.length() - 1 ) {
                    System.out.println(totalPrice);
                    min = Math.min(min , totalPrice);
                    break;
                }
            }

            if (wordIdx < word.length() - 1) {
                setMinimumTotalPrice(totalPrice, clonedBookWordCountList, isUsed);
            }

            isUsed[i] = false;
        }

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    public static void setMinimumTotalPrice(int totalPrice, int[][] bookList, boolean[] isUsed) {

        for (int i = 0; i < n; i++) {
            if (isUsed[i] == false) {
                totalPrice += bookPrices[i];

                isUsed[i] = true;

                for (int j = 0; j < 26; j++) {
                    if (wordIdx > word.length() - 1 ) break;

                    if (bookList[i][j] > 0) {
                        if ((char)('A' + j) == word.charAt(wordIdx)) {
                            System.out.print((char)('A' + j) + "   ===   ");
                            System.out.println(word.charAt(wordIdx));
                            wordIdx++;
                            bookList[i][j]--;
                        }
                    }
                }

                if (wordIdx > word.length() - 1 ) {
                    System.out.println(totalPrice);
                    min = Math.min(min , totalPrice);
                    return;
                }

                setMinimumTotalPrice(totalPrice, bookList, isUsed);

                isUsed[i] = false;
            }
        }
    }
}
