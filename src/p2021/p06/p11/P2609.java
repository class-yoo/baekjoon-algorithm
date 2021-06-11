package p2021.p06.p11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2609 {
        static int gcd(int num1 , int num2) {
            if(num2==0) {
                return num1;
            } else {
                return gcd(num2, num1%num2);
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            int result = gcd(num1, num2);
            System.out.println(result);
            System.out.println((num1*num2)/result);
        }
}