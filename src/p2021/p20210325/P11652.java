package p2021.p20210325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P11652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            Long number = Long.parseLong(br.readLine());
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        Long idx = 0L;
        int maxCount = 0;
        for (Long key : map.keySet()) {
            if (maxCount < map.get(key)) {
                idx = key;
                maxCount = map.get(key);
            } else if (maxCount == map.get(key)) {
                idx = idx < key ? idx : key;
            }
        }

        System.out.println(idx);
    }
}
