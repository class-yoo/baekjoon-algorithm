package p2019.P20190211;

import java.util.Scanner;

public class P2751 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i; j < arr.length - 1; j++) {
				min = arr[min] < arr[j + 1] ? min : j + 1;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}