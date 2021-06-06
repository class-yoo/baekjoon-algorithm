package p2021.p06.p06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class P20210 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int idx1 = 0;
                int idx2 = 0;
                int minLength = Math.min(s1.length(), s2.length());

                while (minLength > idx1 && minLength > idx2) {
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();

                    if ('9' >= s1.charAt(idx1)) {
                        for (int i = idx1; i < s1.length(); i++) {
                            if ('9' < s1.charAt(idx1)) {
                                break;
                            }

                            sb1.append(s1.charAt(idx1++));
                        }

                    } else {
                        sb1.append(s1.charAt(idx1++));
                    }

                    if ('9' >= s2.charAt(idx2)) {
                        for (int i = idx2; i < s2.length(); i++) {
                            if ('9' < s2.charAt(idx2)) {
                                break;
                            }

                            sb2.append(s2.charAt(idx2++));
                        }

                    } else {
                        sb2.append(s2.charAt(idx2++));
                    }

                    if (!sb1.toString().equals(sb2.toString())) {
                        if ('9' < sb1.toString().charAt(0) && '9' < sb2.toString().charAt(0)) {
                            return sb1.toString().charAt(0) > sb2.toString().charAt(0) ? 1 : -1;
                        } else if ('9' >= sb1.toString().charAt(0) && '9' >= sb2.toString().charAt(0)) {
                            while ('0' == sb1.toString().charAt(0)) {
                                sb1.deleteCharAt(0);
                            }

                            while ('0' == sb2.toString().charAt(0)) {
                                sb2.deleteCharAt(0);
                            }

                            if (sb1.length() == sb2.length()) {
                                return sb1.toString().compareTo(sb2.toString());
                            } else if (sb1.length() > sb2.length()) {
                                return 1;
                            } else {
                                return -1;
                            }
                        } else {
                            return sb1.toString().compareTo(sb2.toString());
                        }
                    }
                }

                return 0;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb.toString());
    }
}