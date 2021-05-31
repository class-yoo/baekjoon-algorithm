package p2021.p05.p31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        List<File> fileList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("\\.");

            if (!map.containsKey(input[1])) {
                map.put(input[1] , 1);
                continue;
            }

            map.put(input[1], map.get(input[1]) + 1);
        }

        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            fileList.add(new File(key, map.get(key)));
        }

        Collections.sort(fileList, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.getExtension().compareTo(f2.getExtension());
            }
        });

        StringBuilder sb = new StringBuilder();

        for (File file : fileList) {
            sb.append(file.getExtension()).append(" ").append(file.getCount()).append("\n");
        }

        System.out.println(sb.toString());
    }

    static class File {
        private String extension;
        private int count;

        public File(String extension, int count) {
            this.extension = extension;
            this.count = count;
        }

        public String getExtension() {
            return extension;
        }

        public int getCount() {
            return count;
        }
    }
}
