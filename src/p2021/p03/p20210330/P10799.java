package p2021.p03.p20210330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] parenthesises = input.toCharArray();
        int stickCount = 0;
        int cutStickCount = 0;

        for (int i = 0; i < parenthesises.length; i++) {
            if (i + 1 < parenthesises.length
                    && parenthesises[i] == '('
                    && parenthesises[i+1] == ')') { // 레이저면 겹쳐진 막대기 수만큼 조각수 증각
                cutStickCount += stickCount;
                i++; // 닫은괄호 개수까지 생각해서 i++
            } else if(parenthesises[i] == ')') { // 막대기 하나가 줄어들었기때문에 조각+1 겹친막대기 수 -1
                cutStickCount ++;
                stickCount--;
            } else if(parenthesises[i] == '(') { // 막대기 하나가 추가되었기때문에 겹쳐진 막대기 수 +1
                stickCount++;
            }
        }

        System.out.println(cutStickCount);
    }
}
