package p2021.p20210325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {
    public static void main(String[] args) throws IOException {

        int[] arr = new int [10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10000 ; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append('\n'); // 한번에 출력하기위해 StringBuilder에 담기
            }
        }

        System.out.println(sb);
    }
}
