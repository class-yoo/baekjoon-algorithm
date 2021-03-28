package p20210328;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char[] arr = input.toCharArray();

            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < arr.length; j++) {
                if (stack.isEmpty()) {
                    stack.push(arr[j]);
                    continue;
                }

                if (stack.peek() == ')') {
                    break;
                }

                if (arr[j] == ')') {
                    stack.pop();
                    continue;
                }

                stack.push(arr[j]);
            }

            System.out.println(stack.isEmpty() ? "YES" : "NO");
        }
    }
}
