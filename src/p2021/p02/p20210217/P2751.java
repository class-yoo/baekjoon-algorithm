package p2021.p02.p20210217;

import java.util.Scanner;

public class P2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
	}
	
	public static void quickSort(int [] arr, int left, int right) {
		
		int mid = (left + right) / 2;
		
		while (left < right) {
			
			
		}
		
	}
	
	public static void  swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}


