package p20210210;

import java.util.Scanner;

public class P1753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int startNode = sc.nextInt();
        final int INF = 11 * v;

        int [] nodes = new int [v+1];

        for (int j = 1; j < v+1; j++) {
            if (startNode != j) {
                nodes[j] = INF;
            }
        }

        for (int i = 0; i < e; i++) {
            int depNode = sc.nextInt();
            int destNode = sc.nextInt();
            int cost = sc.nextInt();

            nodes[destNode] = Math.min(nodes[destNode], nodes[depNode] + cost);
        }

        for (int i = 1; i < v+1; i++) {
            if (nodes[i] != INF) {
                System.out.println(nodes[i]);
            } else {
                System.out.println("INF");
            }
        }
    }
}