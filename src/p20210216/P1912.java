package p20210216;

import java.util.Scanner;

public class P1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = -1000;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += sc.nextInt();
			max = Math.max(max, sum);
			if (sum < 0) sum = 0;
		}
		
		System.out.println(max);
	}
}
