package p2021.p20210419;

import java.util.Scanner;

public class P9046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] alphabet = new int[26];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            temp = temp.replaceAll(" ","");

            for (int j = 0; j < temp.length(); j++) {
                int idx = (int)(temp.charAt(j) - 'a');
                alphabet[idx]++;
            }

            int maxAlphabetIdx = 0;
            int max = 0;
            char answer = 'a';

            for (int j = 0; j < alphabet.length; j++) {
                if (max < alphabet[j]) {
                    max = alphabet[j];
                    maxAlphabetIdx = j;
                }
            }

            answer = (char)(maxAlphabetIdx + 'a');

            for (int j = 0; j < alphabet.length; j++) {
                if (maxAlphabetIdx != j && max == alphabet[j]) {
                    answer = '?';
                    break;
                }
            }

            System.out.println(answer);
        }

    }
}