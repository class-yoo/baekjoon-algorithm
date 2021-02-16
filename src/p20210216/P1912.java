package p20210216;

import java.util.Scanner;

public class P1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
			
			if (sum < 0) sum = 0;
		}
		
		System.out.println(max);
	}
}
