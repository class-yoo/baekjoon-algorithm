package p2021.p07.p17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P1456 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int max = 10000000;

        boolean prime[] = new boolean[max+1];
        for(int i=2; i<=max; i++) {
            for(int j=i*2; j<=max; j+=i) {
                prime[j] = true;
            }
        }

        ArrayList<Long> list = new ArrayList<Long>();
        for(int i=2; i<=max; i++) {
            if(b <= i) break;
            if(!prime[i]) {
                for(int j=2; true; j++) {
                    if((long)Math.pow(i, j) > b) break;
                    list.add((long)Math.pow(i, j));
                }
            }
        }

        Collections.sort(list);
        int left = 0;
        int right = list.size()-1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(list.get(mid) >= a) right = mid-1;
            else left = mid+1;
        }
        System.out.println(list.size() - left);
    }
}
