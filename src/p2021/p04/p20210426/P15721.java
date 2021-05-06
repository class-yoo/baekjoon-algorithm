package p2021.p04.p20210426;

import java.util.Scanner;

public class P15721 {
    public static void main(String[] args) {
        int speakIdx =  getSpeakIdx();

        System.out.println(speakIdx);
    }

    public static int getSpeakIdx() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int t = sc.nextInt();
        int zeroOrOne = sc.nextInt();

        int speakIdx=  0;
        int sentenceSeq = 1;

        int seq = 1;

        while(seq <= t) {
            for (int i = 0; i < 2; i++) {
                if (seq == t && zeroOrOne == 0) return speakIdx%a;
                speakIdx++;

                if (seq == t && zeroOrOne == 1) return speakIdx%a;
                speakIdx++;
                seq++;
            }

            for (int i = 0; i < sentenceSeq+1; i++) {
                if (seq+i == t && zeroOrOne == 0) {
                    return speakIdx%a;
                }
                speakIdx++;
            }

            for (int i = 0; i < sentenceSeq+1; i++) {
                if (seq == t && zeroOrOne == 1)
                    return speakIdx%a;
                speakIdx++;
                seq++;
            }

            sentenceSeq++;
        }

        return speakIdx;
    }
}