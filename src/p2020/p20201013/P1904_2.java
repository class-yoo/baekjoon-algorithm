package p2020.p20201013;

import java.util.Scanner;

public class P1904_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[1000000];
		arr[0] = 1;
		arr[1] = 2;

		for (int i = 2; i < N; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		
		System.out.println(arr[N-1]);
	}

}

