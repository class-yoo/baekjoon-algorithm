package p2021.p05.p31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (set.contains(input)) {
                list.add(input);
            }
        }
        Collections.sort(list);

        for (String name : list) {
            sb.append(name).append("\n");
        }

        System.out.println(list.size() + "\n" + sb.toString());
    }
}
