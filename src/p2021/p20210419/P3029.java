package p2021.p20210419;

import java.util.Scanner;

public class P3029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String startTime = sc.next();
        String endTime = sc.next();

        String [] startHMS = startTime.split(":");
        String [] endHMS = endTime.split(":");

        int startH = Integer.parseInt(startHMS[0]);
        int startM = Integer.parseInt(startHMS[1]);
        int startS = Integer.parseInt(startHMS[2]);

        int endH = Integer.parseInt(endHMS[0]);
        endH = endH < startH || startTime.equals(endTime) ? endH + 24 : endH;
        int endM = Integer.parseInt(endHMS[1]);
        int endS = Integer.parseInt(endHMS[2]);

        int totalStartSecond = startH * 3600 + startM * 60 + startS;
        int totalEndSecond = endH * 3600 + endM * 60 + endS;

        int hidingTime = totalEndSecond - totalStartSecond;
        int hidingH = hidingTime / 3600;
        hidingTime = hidingTime % 3600;
        int hidingM = hidingTime / 60;
        hidingTime = hidingTime % 60;
        int hidingS = hidingTime;

        String answer = hidingH < 10 ? "0" + String.valueOf(hidingH) : String.valueOf(hidingH);
        answer += ":";
        answer += hidingM < 10 ? "0" + String.valueOf(hidingM) : String.valueOf(hidingM);
        answer += ":";
        answer += hidingS < 10 ? "0" + String.valueOf(hidingS) : String.valueOf(hidingS);

        System.out.println(answer);
    }
}
