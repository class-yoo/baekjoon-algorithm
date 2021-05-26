package p2021.p05.p26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!set.contains(word)) {
                list.add(word);
                set.add(word);
            }
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }

                return o1.length() > o2.length() ? 1 : -1;
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) + "\n");
        }

        System.out.println(sb.toString());
    }
}