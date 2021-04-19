package p2021.p20210417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String winner = "";
        if (n%2 == 0) winner = "CY";
        else winner = "SK";

        System.out.println(winner);
    }
}
