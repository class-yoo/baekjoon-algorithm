package p2021.p06.p07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P2504 {

    public static final String NAME = "AA";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean isPass = true;

        if (input.length() % 2 == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(input.charAt(i));
                continue;
            }

            if (input.charAt(i) == '[' || input.charAt(i) == '(') {
                stack.push(input.charAt(i));
                continue;
            }

            char item = stack.pop();

            if (item == '[') {
                if (input.charAt(i) != ']') {
                    isPass = false;
                    break;
                }
            } else if (item == '(') {
                if (input.charAt(i) != ')') {
                    isPass = false;
                    break;
                }
            } else {
                isPass = false;
                break;
            }

        }

        if (!isPass) {
            System.out.println(0);
            return;
        }

        Stack<String> stack2 = new Stack<>();

        input = input.replace("[]", "3").replace("()", "2");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (temp == ']' || temp == ')') {
                String open = temp == ']' ? "[" : "(";
                int sum = 0;
                String number = "";
                while (!(number = stack2.pop()).equals(open)) {
                    sum += Integer.parseInt(number);
                }

                int mulNum = temp == ']' ? 3 : 2;
                sum *= mulNum;
                stack2.push(sum + "");
                continue;
            }

            stack2.push(String.valueOf(temp));
        }
        int result = 0;
        while (!stack2.isEmpty()) {
            if (stack2.peek().equals("(") || stack2.peek().equals("[")) {
                result = 0;
                break;
            }

            result += Integer.parseInt(stack2.pop());
        }

        System.out.println(result);
    }
}
