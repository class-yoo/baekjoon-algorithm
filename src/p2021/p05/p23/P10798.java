package p2021.p05.p23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String lineString = br.readLine();
            for (int j = 0; j < lineString.length(); j++) {
                arr[i][j] = lineString.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 15 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                if (arr[j][i] != 0)
                    sb.append(arr[j][i]);
            }
        }

        System.out.println(sb.toString());
    }
}
