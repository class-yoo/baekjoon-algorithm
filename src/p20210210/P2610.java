package p20210210;

import java.util.*;

public class P2610 {

    static int[][] relation;
    static boolean[][] isChecked;
    static int INF;
    static boolean[] isCounted;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        INF = n+1;
        isCounted = new boolean[n+1];

        relation = new int [n+1][n+1];
        isChecked = new boolean[n+1][n+1];

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if(i != j) {
                    relation[i][j] = INF;
                    relation[j][i] = INF;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            relation[m1][m2] = 1;
            relation[m2][m1] = 1;
        }

        for (int k = 0; k < n+1; k++) {
            for (int i = 0; i < n+1; i++) {
                for (int j = 0; j < n+1; j++) {
                    relation[i][j] = Math.min(relation[i][j], relation[i][k] + relation[k][j]);
                }
            }
        }

        ArrayList<Integer> answers = new ArrayList<>();
        int groupCnt = 0;
        for (int i = 1; i < n+1; i++) {
            ArrayList<Integer> list = null;
            if (isCounted[i] == false) {
                isCounted[i] = true;
                groupCnt++;
                list = getGroupMember(i);
            }

            if (list != null) {
                int minCost = n+1;
                int repMember = 0;
                for (int member : list) {
                    ArrayList<Integer> copiedList = (ArrayList<Integer>) list.clone();
                    int tempMaxCost = 0;
                    for (int targetMember : copiedList) {
                        tempMaxCost = Math.max(tempMaxCost, relation[member][targetMember]);
                    }

                    if (minCost > tempMaxCost) {
                        repMember = member;
                        minCost = tempMaxCost;
                    }
                }
                answers.add(repMember);
            }
        }

        Collections.sort(answers);

        System.out.println(groupCnt);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }

    public static ArrayList<Integer> getGroupMember(int member) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < relation.length; i++) {
            if (isChecked[member][i] == false && relation[member][i] != INF) {
                isChecked[member][i] = true;
                isChecked[i][member] = true;
                list.add(i);
                isCounted[i] = true;
            }
        }

        return list;
    }
}
