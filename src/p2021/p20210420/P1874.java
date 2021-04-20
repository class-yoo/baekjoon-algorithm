package p2021.p20210420;

import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        stack.push(number++);
        sb.append("+\n");
        for (int i = 0; i < n; i++) {
            while(number <= arr[i]) {
                stack.push(number++);
                sb.append("+\n");
            }

            int poppedNum = stack.pop();
            sb.append("-\n");

            if (poppedNum != arr[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(sb.toString());
    }
}
