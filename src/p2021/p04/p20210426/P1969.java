package p2021.p04.p20210426;

import java.util.Scanner;

public class P1969 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] s = new String [n];

        for (int i = 0; i < n ; i++) {
            s[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < m ; i++) {
            int[] score = new int [4];
            int max = 0;
            char maxDNA = 'A';
            for (int j = 0; j < n; j++) {
                char dna = s[j].charAt(i);
                int scoreIdx = 0;

                if(dna == 'T') {
                    scoreIdx = 1;
                } else if(dna == 'G') {
                    scoreIdx = 2;
                } else if(dna == 'C') {
                    scoreIdx = 3;
                }

                score[scoreIdx]++;

                if (score[scoreIdx] > max ) {
                    max = score[scoreIdx];
                    maxDNA = dna;
                } else if (score[scoreIdx] == max) {
                    maxDNA = maxDNA < dna ? maxDNA : dna;
                }
            }

            sb.append(maxDNA);
            count += (n-max);
        }

        System.out.println(sb.toString());
        System.out.println(count);
    }
}
