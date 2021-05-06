package p2021.p04.p20210420;

import java.util.*;

public class P1966 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();

        for (int i = 0; i < loop; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sequence = 1;

            Queue<Docs> queue = new LinkedList<>();
            Integer [] numbers = new Integer[n];

            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                numbers[j] = number;
                queue.add(new Docs(j, number));
            }

            Arrays.sort(numbers, Collections.reverseOrder());
            int numberIdx = 0;

            while (!queue.isEmpty()) {
                Docs docs = queue.poll();
                if(docs.getPriority() == numbers[numberIdx]) {
                    if (docs.getIdx() == m) break;
                    sequence++;
                    numberIdx++;
                } else {
                    queue.add(docs);
                }
            }

            System.out.println(sequence);
        }
    }

    static class Docs {
        private int idx;
        private int priority;

        public Docs(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }

        public int getIdx() {
            return idx;
        }

        public int getPriority() {
            return priority;
        }
    }
}
