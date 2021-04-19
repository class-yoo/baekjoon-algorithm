package p2021.p20210419;

import java.util.Scanner;

public class P11365 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        while (!"END".equals(line)) {
            String temp = "";
            for (int i = line.length() -1; i >= 0 ; i--) {
                temp += line.charAt(i);
            }
            System.out.println(temp);
            line = sc.nextLine();
        }


    }
}
