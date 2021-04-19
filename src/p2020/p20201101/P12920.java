package p2020.p20201101;

import java.util.Scanner;

public class P12920 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int itemCount = sc.nextInt();
		int maxWeight = sc.nextInt();

		int tempArr[][] = new int[itemCount][3];
		int totalItemCount = 0;
		for (int i = 1; i <= itemCount; i++) {
			tempArr[i][0] = sc.nextInt();
			tempArr[i][1] = sc.nextInt();
			totalItemCount += tempArr[i][2] = sc.nextInt();
		}

		int arr[][] = new int[totalItemCount][maxWeight];
		
//		for (int i = 1; i <= arr.length; i++) {
//			for (int j = 1; j <= arr[0].length; j++) {
//				if (j < W) {
//					arr[i][j] = arr[i - 1][j];
//					continue;
//				}
//				arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - W] + V);
//			}
//		}
		
	}
}