package p2021.p06.p03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P20437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());
            int max = 0;
            int min = W.length() + 1;
            List<Integer>[] idxTable = new ArrayList[26];

            for (int j = 0; j < W.length(); j++) {

                List<Integer> idxList = idxTable[W.charAt(j) - 'a'];

                if(idxList == null) {
                    idxList = new ArrayList<>();
                    idxTable[W.charAt(j) - 'a'] = idxList;
                }

                idxList.add(j);

                if (idxList.size() >= K) {
                    int startIdx = idxList.get(idxList.size() - K);
                    int endIdx = idxList.get(idxList.size() - 1);
                    min = Math.min(min, endIdx - startIdx + 1);
                    max = Math.max(max, endIdx - startIdx + 1);
                }
            }

            if (min == W.length() + 1 || max == 0) {
                sb.append(-1).append("\n");
                continue;
            }

            sb.append(min).append(" ").append(max).append("\n");
        }

        System.out.println(sb.toString());
    }
}
