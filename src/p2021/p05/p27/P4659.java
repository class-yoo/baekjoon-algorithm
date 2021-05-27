package p2021.p05.p27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P4659 {
    static Set<Character> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        while (!word.equals("end")) {

            if (isPossibleWord(word)) {
                sb.append("<"+ word +"> is acceptable.\n");
            } else {
                sb.append("<"+ word +"> is not acceptable.\n");
            }

            word = br.readLine();
        }

        System.out.println(sb.toString());
    }

    public static boolean isPossibleWord(String word) {

        boolean containsVowel = false;
        int vowelCnt = 1;
        int consonantCnt = 1;

        if (isVowel(word.charAt(0))) {
            containsVowel = true;
            consonantCnt = 0;
        } else {
            vowelCnt = 0;
        }

        for (int i = 1; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                containsVowel = true;
                vowelCnt++;
                consonantCnt = 0;
                if (vowelCnt >= 3) return false;
            } else {
                consonantCnt++;
                vowelCnt=0;
                if (consonantCnt >= 3) return false;
            }

            if (word.charAt(i) == word.charAt(i-1)) {
                if (word.charAt(i) != 'e' && word.charAt(i) != 'o') {
                    return false;
                }
            }
        }

        if (containsVowel == false) return false;

        return true;
    }

    public static boolean isVowel(char c) {
        if (set.contains(c))
            return true;
        return false;
    }
}
