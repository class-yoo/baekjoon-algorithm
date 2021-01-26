package P20190308;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int roop = sc.nextInt();
		int number =0;
		int max = 0, min =1000000;
		for (int i = 0; i < roop; i++) {
			number = sc.nextInt();
			max = max>number? max :number;
			min = min>number? number :min;
		}
		System.out.println(min + " "+ max);
		sc.close();
	}
}