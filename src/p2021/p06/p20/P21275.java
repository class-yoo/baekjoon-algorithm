package p2021.p06.p20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21275 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        String result = "";
        int cnt = 0;

        for (int i = 2; i <= 36; i++) {
            boolean isAPass = true;
            int aMulNum = 1;
            int aTotal = 0;
            for (int j = A.length() - 1; j >= 0; j--) {
                int tempNum = convertWordToNumber(A.charAt(j));
                if (tempNum >= i) {
                    isAPass = false;
                    break;
                }

                aTotal += tempNum * aMulNum;
                aMulNum *= i;
            }

            if (isAPass == true) {
                for (int k = 2; k <= 36; k++) {
                    if (i != k) {
                        boolean isBPass = true;
                        int bMulNum = 1;
                        int bTotal = 0;
                        for (int j = B.length() - 1; j >= 0; j--) {
                            int tempNum = convertWordToNumber(B.charAt(j));
                            if (tempNum >= k) {
                                isBPass = false;
                                break;
                            }

                            bTotal += tempNum * bMulNum;
                            bMulNum *= k;
                        }

                        if(isBPass == true) {
                            if (aTotal == bTotal) {
                                cnt++;
                                result = aTotal + " " + i + " " + k;
                                break;
                            }
                        }
                    }
                }
            }
        }

        if (cnt > 1) {
            result = "Multiple";
        } else if(cnt == 0) {
            result = "Impossible";
        }

        System.out.println(result);
    }

    public static int convertWordToNumber(char word) {
        if (word < 'a') {
            return word - '0';
        }

        return 10 + word - 'a';
    }
}
