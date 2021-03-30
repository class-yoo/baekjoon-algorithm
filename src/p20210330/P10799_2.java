package p20210330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10799_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int stickCount = 0;
        int cutStickCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length()
                    && input.charAt(i) == '('
                    && input.charAt(i+1) == ')') {
                cutStickCount += stickCount;
                i++; // 닫은괄호 개수까지 생각해서 i++
            } else if(input.charAt(i) == ')') {
                cutStickCount ++;
                stickCount--;
            } else if(input.charAt(i) == '(') {
                stickCount++;
            }
        }

        System.out.println(cutStickCount);
    }
}
