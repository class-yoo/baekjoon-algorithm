package p2021.p05.p09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P12919 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int result = 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(t);

        while(!queue.isEmpty()) {

            String alphabet = queue.poll();

            if (alphabet.charAt(alphabet.length() - 1) == 'A') {
                String temp = alphabet.substring(0 , alphabet.length() - 1);

                if(temp.length() < s.length()) break;

                if (temp.equals(s)) {
                    result = 1;
                    break;
                }

                queue.add(temp);
            }

            if (alphabet.charAt(0) == 'B') {
                StringBuilder sb = new StringBuilder(alphabet.substring(1));
                String temp = sb.reverse().toString();

                if(temp.length() < s.length()) break;

                if (temp.equals(s)) {
                    result = 1;
                    break;
                }

                queue.add(temp);
            }
        }

        System.out.println(result);
    }
}
