package p20201108;

import java.util.Scanner;

public class P9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = sc.nextInt();
		int[] numberArr = new int[roop];
		for (int k = 0; k < roop; k++) {
			numberArr[k] = sc.nextInt();
		}
		int arr[] = new int[11];

		arr[0] = arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i <= 10; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3]);
		}

		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(arr[numberArr[i]]);
		}
	}
}
