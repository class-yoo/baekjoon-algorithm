package p2020.p20201101;

import java.util.Scanner;

public class P12865 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int itemCount = sc.nextInt();
		int maxWeight = sc.nextInt();

		int arr[][] = new int[itemCount + 1][maxWeight + 1];

		int i = 1;
		int j = 1;
		for (i = 1; i <= itemCount; i++) {
			int W = sc.nextInt();
			int V = sc.nextInt();
			for (j = 1; j <= maxWeight; j++) {
				if (j < W) {
					arr[i][j] = arr[i - 1][j];
					continue;
				}

				arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - W] + V);
			}

		}

		System.out.println(arr[i-1][j-1]);	

	}
}